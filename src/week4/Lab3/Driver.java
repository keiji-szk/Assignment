package week4.Lab3;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) throws Exception {
        ArrayList<Piece> arrPiece = new ArrayList<>();
        arrPiece.add(new Bishop());
        arrPiece.add(new King());
        arrPiece.add(new Knight());
        arrPiece.add(new Pawn());
        arrPiece.add(new Queen());
        arrPiece.add(new Rook());
        for (Piece p : arrPiece) {
            p.move();
        }

        Pawn p1 = new Pawn(true);
        Pawn p2 = new Pawn(true);
        Pawn p3 = new Pawn(false);
        Pawn p4 = new Pawn(false);
        Pawn p5 = new Pawn(true);
        p1.promote(new Queen());
        p4.promote(new Queen());
        p5.promote(new Knight());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p1.equals(p5));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p5));
    }
}
