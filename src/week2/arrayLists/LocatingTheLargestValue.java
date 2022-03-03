package week2.arrayLists;

import java.util.ArrayList;
import java.util.Random;

public class LocatingTheLargestValue {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            ls.add(rnd.nextInt(100) + 1);
        }
        System.out.println("ArrayList: " + ls);

        int maxVal = 0;
        int slotNum = -1;
        for (int i = 0; i < ls.size(); ++i) {
            if (maxVal < ls.get(i)) {
                maxVal = ls.get(i);
                slotNum = i;
            }
        }

        System.out.println("");
        System.out.println("The largest value is " + maxVal + ", which is in slot " + slotNum);
    }
}
