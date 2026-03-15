package Task2;

public class Rook extends ChessPiece {

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
        return startX == endX || startY == endY;
    }

}
