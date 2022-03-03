package week2.arrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            ls.add(rnd.nextInt(100) + 1);
        }
        System.out.println("ArrayList: " + ls);
    }
}
