package retos;

import java.util.HashSet;

public class HasDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3};

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);

            HashSet<Integer> duplicate = new HashSet<>();

            duplicate.add(1);
            duplicate.add(2);
            duplicate.add(3);
            duplicate.add(3);

            System.out.println(duplicate);
        }





    }



}
