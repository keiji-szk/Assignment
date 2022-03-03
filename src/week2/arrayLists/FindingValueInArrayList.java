package week2.arrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class FindingValueInArrayList {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for (int i = 0; i < 10; ++i) {
            ls.add(rnd.nextInt(100) + 1);
        }
        System.out.println("ArrayList: " + ls);

        System.out.print("\nValue to find: ");
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for (int i = 0; i < ls.size(); ++i) {
            if (ls.get(i) == inputNum) {
                System.out.println(inputNum + " is in the ArrayList");
            }
        }
    }
}
