package daysjavacode;

import java.util.Random;

public class Day1 {
    public static void main(String[] args) {

        int minRange = 0;
        int maxRange = 100;

        int rndNumber = (int) (Math.random() * (maxRange - minRange + 1)) + minRange;


        System.out.println(rndNumber);
    }
}
