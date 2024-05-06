
public class Movement {
	public Piece piece;
	char startColumn;
	char finishColumn;
	int startRow;
	int finishRow;
	
	public Movement(Piece piece, char startColumn, int startRow, char finishColumn, int finishRow) {
		this.piece = piece;
		this.startColumn = startColumn;
		this.startRow = startRow;
		this.finishColumn = finishColumn;
		this.finishRow = finishRow;
	}
	public String toString() {
		return piece.toString() + " from " + startColumn + startRow + " to " + finishColumn + finishRow;
	}
}
