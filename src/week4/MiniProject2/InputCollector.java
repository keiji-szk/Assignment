package week4.MiniProject2;

import java.util.Scanner;

public class InputCollector {
    static public String getUserInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
