package week4.Lab3;

public class Rook extends Piece {
    static final int IMPORTANCE = 5;

    public Rook() {
        this(true);
    }

    public Rook(boolean isWhite) {
        super(isWhite, IMPORTANCE);
    }

    @Override
    public String toString() {
        return "Rook{value='" + getValue() + "'}";
    }

    @Override
    public void move() {
        System.out.println("Horizontally or vertically");
    }
}