package week4.Lab3;

public class King extends Piece {
    static final int IMPORTANCE = 1000;

    public King() {
        this(true);
    }

    public King(boolean isWhite) {
        super(isWhite, IMPORTANCE);
    }

    @Override
    public String toString() {
        return "King{value='" + getValue() + "'}";
    }

    @Override
    public void move() {
        System.out.println("One square");
    }
}
