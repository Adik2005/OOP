package Task2;

public class ChessTest {
    public static void main(String[] args) {
        ChessPiece king = new King();
        ChessPiece queen = new Queen();
        ChessPiece rook = new Rook();
        ChessPiece bishop = new Bishop();
        ChessPiece pawn = new Pawn();

        System.out.println("King move: " + king.canMove(4,4,5,5));
        System.out.println("Queen move: " + queen.canMove(2,2,5,5));
        System.out.println("Rook move: " + rook.canMove(1,1,1,8));
        System.out.println("Bishop move: " + bishop.canMove(3,3,6,6));
    }
}
