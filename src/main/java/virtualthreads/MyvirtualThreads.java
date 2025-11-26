package virtualthreads;


import java.util.ArrayList;
import java.util.List;

public class MyvirtualThreads {
    public static void main(String[] args) throws InterruptedException {


        /*Thread.Builder builder = Thread.ofVirtual().name("Message 1", 0);
        Runnable task = () -> {
            System.out.println("ThreadID: " + Thread.currentThread().threadId());
        };

        // message 1
        Thread t1 = builder.start(task);
        t1.join();
        System.out.println(t1.getName() + " terminated");

        // message 2
        Thread t2 = builder.start(task);
        t2.join();
        System.out.println(t2.getName() + " terminated");
        */



        /*
        * Objetivo
           Crear un método que reciba una lista de mensajes (String) y los procese en hilos virtuales, mostrando:
           El nombre del hilo que procesa cada mensaje.
           El ID del hilo.
           Un mensaje final indicando que ha terminado.

Requisitos

Crear un método llamado processMessages que reciba List<String> messages.

Para cada mensaje, crear un hilo virtual que:

Imprima: "Procesando mensaje: <mensaje> | ThreadID: <id> | ThreadName: <nombre>"

Espera 500 ms para simular procesamiento.

Imprima "Mensaje <mensaje> terminado".

Esperar a que todos los hilos terminen antes de salir del método.

Usar nombres de hilo con prefijo "Processor" y un número incremental.
        * */


    }

    public void processMessages(List<String> messages) throws InterruptedException {
        for (int i = 0; i < messages.size(); i++) {
            Thread.Builder builder = Thread.ofVirtual().name("Message processing: hello", 0);
            Runnable task = () -> {
                System.out.println("ThreadID: " + Thread.currentThread().threadId());
            };

            //scheduler for 500ms???
            Thread t1 = builder.start(task);
            t1.join();
            System.out.println(t1.getName() + "Terminated");
            
        }

    }



}
