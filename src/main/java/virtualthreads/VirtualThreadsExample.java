package virtualthreads;

import java.time.Duration;
import java.time.Instant;

public class VirtualThreadsExample {

    public static void main(String[] args) {

        try {
            Thread.Builder builder = Thread.ofVirtual().name("worker-", 0);
            Runnable task = () -> {
                System.out.println("Thread ID: " + Thread.currentThread().threadId());
            };

            // name "worker-0"
            Thread t1 = builder.start(task);
            t1.join();
            System.out.println(t1.getName() + " terminated");

            // name "worker-1
            Thread t2 = builder.start(task);
            t2.join();
            System.out.println(t2.getName() + " terminated");

            // Waiting two seconds before launch the Threads
            Thread.sleep(2000);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant start = Instant.now();

        // Launching 100.000 virtual threads
        for (int i = 0; i < 100_000; i++) {
            Thread.startVirtualThread(() -> {
                System.out.println(Thread.currentThread());
            });
        }

        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);

        System.out.println("Total time " + duration.toMillis() + " ms");

    }
}




