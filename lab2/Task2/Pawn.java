package Task2;

public class Pawn extends ChessPiece {

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
        return endX == startX + 1 && endY == startY;
    }
}