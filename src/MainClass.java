
public class MainClass {

	public static void main(String[] args) {
		
		Game game = new Game();
		Piece whitePawn1 = game.board.getPiece(2, 'D');
		Piece whitePawn2 = game.board.getPiece(2, 'E');
		Piece blackPawn1 = game.board.getPiece(7, 'E');
		Piece blackBishop1 = game.board.getPiece(8, 'F');

		game.movePiece(new Movement(whitePawn1, 'D', 2, 'D', 3));
		game.movePiece(new Movement(blackPawn1, 'E', 7 ,'E', 5));
		game.movePiece(new Movement(whitePawn2, 'E', 2 , 'E', 4));
		game.movePiece(new Movement(blackBishop1,'F', 8,'B', 4));
		
		System.out.println(game);
	}

}
