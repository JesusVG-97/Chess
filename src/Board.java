
public class Board {
	private Piece [][] board;
	
	public Board() {
		
		board = new Piece [8][8];
		for (int i = 2; i < 6; i++){
			for (int j = 0; j < 8; j++) {
				board[i][j] = null;
			}
		}
		for (int i = 0 ; i < 8; i++) {
			board[1][i] = new Piece (TypeOfPiece.PAWN, Color.WHITE); 
			board[6][i] = new Piece (TypeOfPiece.PAWN, Color.BLACK); 
		}
		board[0][0] = new Piece(TypeOfPiece.TOWER, Color.WHITE);
		board[0][1] = new Piece(TypeOfPiece.KNIGHT, Color.WHITE);
		board[0][2] = new Piece(TypeOfPiece.BISHOP, Color.WHITE);
		board[0][3] = new Piece(TypeOfPiece.QUEEN, Color.WHITE);
		board[0][4] = new Piece(TypeOfPiece.KING, Color.WHITE);
		board[0][5] = new Piece(TypeOfPiece.BISHOP, Color.WHITE);
		board[0][6] = new Piece(TypeOfPiece.KNIGHT, Color.WHITE);
		board[0][7] = new Piece(TypeOfPiece.TOWER, Color.WHITE);
		
		board[7][0] = new Piece(TypeOfPiece.TOWER, Color.BLACK);
		board[7][1] = new Piece(TypeOfPiece.KNIGHT, Color.BLACK);
		board[7][2] = new Piece(TypeOfPiece.BISHOP, Color.BLACK);
		board[7][3] = new Piece(TypeOfPiece.QUEEN, Color.BLACK);
		board[7][4] = new Piece(TypeOfPiece.KING, Color.BLACK);
		board[7][5] = new Piece(TypeOfPiece.BISHOP, Color.BLACK);
		board[7][6] = new Piece(TypeOfPiece.KNIGHT, Color.BLACK);
		board[7][7] = new Piece(TypeOfPiece.TOWER, Color.BLACK);
	}
	public boolean movePiece(Movement movement) {
		if (movement.startColumn < 'A' || movement.startColumn > 'H' || movement.finishColumn < 'A' || movement.finishColumn > 'H' 
				|| movement.startRow < 1 || movement.startRow > 8 || movement.finishRow < 1 || movement.finishRow > 8) {
			return false;
		}
		if (board[movement.startRow -1][movement.startColumn - 65] != movement.piece) {
			return false;
		}
		board[movement.startRow -1][movement.startColumn - 65] = null;
		board[movement.finishRow -1][movement.finishColumn - 65] = movement.piece;
		return true;
	}
	public Piece getPiece(int row, char col) {
		return board[row - 1][col - 'A'];
	}
	public String toString() {
		String s = "";
		for (int row = 8; row >= 1; row--) {
				s = s + row + " ";
				for (int col = 0; col < 8; col++) {
					if (board[row -1][col] == null) {
						s = s + ". ";
					} else {
						s = s + board[row-1][col].getLetter() + " ";					
				}
			}
				s = s + "\n";
		}
		s = s + "  ";
		
		for (char i = 'A' ; i <= 'H'; i++) {
			s = s + i + " ";
		}
		return s;
	}
	
}
