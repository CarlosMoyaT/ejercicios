import java.util.HashMap;
import java.util.Map;

public class CreationMap {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();

        myMap.put("January", 1);
        myMap.put("February", 2);
        myMap.put("March", 3);
        myMap.put("April", 4);
        myMap.put("May", 5);
        myMap.put("June", 6);
        myMap.put("July", 7);
        myMap.put("August", 8);
        myMap.put("September", 9);
        myMap.put("October", 10);
        myMap.put("November", 11);
        myMap.put("December", 12);

        System.out.println("Months " + myMap);
        System.out.println("Number from March = " + myMap.get("March"));





    }
}
