package week4.Lab3;

import java.util.Objects;


public abstract class Piece {
    private int value;
    private boolean isWhite;

    public Piece(boolean isWhite, int value) {
        this.isWhite = isWhite;
        this.value = value;
    }

    @Override
    abstract public String toString();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return value == piece.value && isWhite == piece.isWhite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, isWhite);
    }

    abstract public void move();

    public int getValue() {
        return value;
    }

    public boolean isWhite() {
        return isWhite;
    }

    protected void setValue(int value) {
        this.value = value;
    }

    protected void setWhite(boolean white) {
        this.isWhite = white;
    }
}
