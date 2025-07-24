package lambda;

import java.util.function.Function;

public class Lambda {


    public static void main(String[] args) {

        Function<String, Integer> sizeOf = (String s) -> {
            return s.length();
        };

        // or same function


    }
}
