package Task2;

public class Queen extends ChessPiece {
    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {
        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);
        return startX == endX || startY == endY || dx == dy;

    }

}
