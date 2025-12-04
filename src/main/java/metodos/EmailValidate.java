package metodos;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;


public class EmailValidate {
    public static void main(String[] args) {

        /*
        *
        *  Cómo pensarlo:
           ¿Qué necesito recibir? → un email (String)
           ¿Qué necesito devolver? → true/false (boolean)
           ¿Qué validar? → que contenga @ y tenga texto antes y
           *
           * En tu API de usuarios, necesitas verificar si un email es válido antes de guardarlo.
             Como sistema, necesito validar que el email tiene formato correcto antes de registrar un usuario*/
    }

    public static boolean isValidEmailFormat(String email) {
        boolean result = true;
        try {
            InternetAddress emailAddress = new InternetAddress(email);
            emailAddress.validate();
        } catch (AddressException e) {
            result = false;
        }
        return result;
    }
}
