package lambda;

public class Main {
    public static void main(String[] args) {

        /*
        *   public void sendMensaje (String name, int edad) {
        *       System.out.println("Hello from lambda " + name);
        *   }
        * */

        Messenger lambdaMessage = (name, age) -> {
            System.out.println("Hello from lambda " + name);
            System.out.println("Im " + age + " years");
        };
        lambdaMessage.sendMensaje("Carlos", 35);

    }
}
