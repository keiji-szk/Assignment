package week2.MiniProject1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameExecute {
    static public String cityFilePath = "./src/week2/MiniProject1/cities.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            PlayGame();
            System.out.print("\nPress y to continue: ");
            String will = scanner.next();
            if (will.compareTo("y") != 0) {
                break;
            }
        } while (true);
    }

    public static void PlayGame() {
        GuessManager mgr = GameExecute.InitializeGameManager();

        // This line should be commented out when released.
        // System.out.println("DEBUG ANSWER: " + mgr.getAnswer());

        // Game Start
        System.out.println("Here's the question.");
        System.out.println(mgr.getDisplayString());
        Scanner scanner = new Scanner(System.in);

        while (mgr.canGuess()) {
            // Demand user input
            System.out.print("Guess a letter: ");
            String guessChar = scanner.next();
            mgr.guessLetter(guessChar);

            // Display hint and wrong letters.
            System.out.println("Yoy are guessing: " + mgr.getDisplayString());
            System.out.println(String.format("You have guessed (%d) wrong letters: %s",
                    mgr.getCounterWrong(),
                    mgr.getWrongLettersString()));

            // Check if user win.
            if (mgr.isCorrect()) {
                System.out.println("You win!");
                System.out.println(String.format("You have guessed '%s' correctly.", mgr.getAnswer()));
                return;
            }
        }

        // User lose
        System.out.println("You loss");
        System.out.println(String.format("The correct word was '%s'!", mgr.getAnswer()));
    }


    public static GuessManager InitializeGameManager() {
        List<String> cityList = GameExecute.ReadCityList();
        Random random = new Random();
        final int randomValue = random.nextInt(cityList.size());
        final String correctAnswer = cityList.get(randomValue);
        return new GuessManager(correctAnswer);
    }

    public static List<String> ReadCityList() {
        List<String> cityList = new ArrayList<>();
        Path filePath = Paths.get(GameExecute.cityFilePath);
        try {
            cityList = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.exit(0);
        }
        return cityList;
    }
}
