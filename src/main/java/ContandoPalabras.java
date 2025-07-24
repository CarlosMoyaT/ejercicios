import java.util.HashMap;
import java.util.Map;

public class ContandoPalabras {

    public static void main(String[] args) {

        /*
         * Crea un programa que cuente cuantas veces se repite cada palabra
         * y que muestre el recuento final de todas ellas.
         * - Los signos de puntuación no forman parte de la palabra.
         * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
         * - No se pueden utilizar funciones propias del lenguaje que
         *   lo resuelvan automáticamente.
         */

        String txt = "Esternocleidomastoideo";
        String[] words = txt.split("\\s+");

        Map<String, Integer> wordRepeat = new HashMap<>();

        for (String word : words) {
           wordRepeat.put(word, wordRepeat.getOrDefault(word, 0) +1);
        }

        for (Map.Entry<String, Integer> input : wordRepeat.entrySet()) {
            System.out.println(input.getKey() + input.getValue());
        }

    }



}
