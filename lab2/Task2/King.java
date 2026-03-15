package Task2;

public class King extends ChessPiece {

    @Override
    public boolean canMove(int startX, int startY, int endX, int endY) {

        int dx = Math.abs(endX - startX);
        int dy = Math.abs(endY - startY);

        return dx <= 1 && dy <= 1;
    }

}
