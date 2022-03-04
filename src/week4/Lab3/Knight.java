package week4.Lab3;

public class Knight extends Piece {
    static final int IMPORTANCE = 2;

    public Knight() {
        this(true);
    }

    public Knight(boolean isWhite) {
        super(isWhite, IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Knight{value='" + getValue() + "'}";
    }

    @Override
    public void move() {
        System.out.println("Like an L");
    }
}

