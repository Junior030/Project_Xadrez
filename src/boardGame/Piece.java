package boardGame;

public class Piece { // Criando class pe�a e atribuindo a posi��o e tabuleiro
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	protected Board getBoard() {//uso exclusivo para camada tabuleiro
		return board;
	}
}
