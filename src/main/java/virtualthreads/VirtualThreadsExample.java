package virtualthreads;

public class VirtualThreadsExample {

    public static void main(String[] args) {


        try {
            Thread.Builder builder = Thread.ofVirtual().name("my first Thread");

            Runnable task = () -> {
                System.out.println("Running thread");
            };

            Thread t = builder.start(task);

            System.out.println("Name of thread t " + t.getName());

            // añadimos un delay al main thread (no al virtual 't') de 2 segundos
            Thread.sleep(2000);

            t.join();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}




