package week1.whileloops;

import java.util.Scanner;

public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me.");
        int numTotal = 0;
        while(true)
        {
            System.out.print("Number: ");
            int num = in.nextInt();
            if (num == 0)
                break;

            numTotal += num;
            System.out.println("The total so far is "+ numTotal);
        }

        System.out.println("\nThe total is "+ numTotal);
    }
}
