package singletonpattern;


public class LoggerService {

    private static volatile LoggerService instance = null;

    private LoggerService() {
        // Constructor siempre privado para evitar instanciación externa
    }

    public static LoggerService getInstance() {
        if (instance == null) {
            synchronized (LoggerService.class) {
                if (instance == null) {
                    instance = new LoggerService();
                }
            }
        }
        return instance;
    }

    // Cualquier singleton debe definir cierta
    // lógica de negocio que pueda ejecutarse en su instancia.

    public void log(String message) {
        System.out.println("[LOG] " + message);
    }


}
