package boardGame;

public class Piece { // Criando class peça e atribuindo a posição e tabuleiro
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
