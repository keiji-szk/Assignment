package week2.arrays;


import java.util.Random;

public class BasicArrays2 {
    public static void main(String[] args) {
        int ls[] = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < ls.length; ++i) {
            ls[i] = rnd.nextInt(100) + 1;
            System.out.println("Slot " + i + " contains a " + ls[i]);
        }
    }
}
