package week1.keyboardinput;

import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        System.out.println("Hello. What is your name?");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("\nHi " + name + "! How old are you?");
        Scanner in2 = new Scanner(System.in);
        int age = in2.nextInt();

        System.out.println("\nSo you're "+ age+
                ", eh? That's not old at all!\nHow much do you make, " + name
                + "?");

        Scanner in3 = new Scanner(System.in);
        double dbNum = in3.nextDouble();

        System.out.println("\n" + dbNum + "! I hope that's per hour and not per year! LOL!");
    }
}
