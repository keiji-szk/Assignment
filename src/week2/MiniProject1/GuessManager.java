package week2.MiniProject1;

import java.util.HashSet;
import java.util.Set;

public class GuessManager {
    private static final Character HIDE_CHARACTER = '_';
    private static final int LIMIT_COUNT_GUESS = 10;

    private final String answer;
    private final Set<Character> letterWrong;
    private final Set<Character> letterCorrect;
    private int counterWrong;

    public GuessManager(String answer) {
        this.answer = answer;
        letterWrong = new HashSet<>();
        letterCorrect = new HashSet<>();
        counterWrong = 0;
    }

    public String getWrongLettersString() {
        StringBuilder builder = new StringBuilder();
        for (Character ch : letterWrong) {
            builder.append(ch);
            builder.append(" ");
        }
        return builder.toString();
    }

    public int getCounterWrong() {
        return counterWrong;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean canGuess() {
        return getCounterWrong() < LIMIT_COUNT_GUESS;
    }

    public String getDisplayString() {
        String ret = "";
        for (int i = 0; i < answer.length(); ++i) {
            final Character ch = Character.toLowerCase(answer.charAt(i));
            if (letterCorrect.contains(ch)) {
                ret += ch;
            } else {
                ret += HIDE_CHARACTER;
            }
        }
        return ret;
    }

    public void guessLetter(String guess) {
        if (guess.length() != 1) {
            ++counterWrong;
            return;
        }
        Character ch = Character.toLowerCase(guess.toCharArray()[0]);
        if (!hasCharNCase(ch)) {
            ++counterWrong;
            letterWrong.add(ch);
            return;
        }

        letterCorrect.add(ch);
    }

    public boolean isCorrect() {
        String dispStr = getDisplayString();
        return dispStr.compareToIgnoreCase(answer) == 0;
    }

    private boolean hasCharNCase(Character ch) {
        return answer.contains(ch.toString().toLowerCase()) ||
                answer.contains(ch.toString().toUpperCase());
    }

}
