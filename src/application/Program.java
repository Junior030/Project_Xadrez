package application;

import java.util.Scanner;

import boardGame.Board;
import boardGame.Position;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Board board = new Board(8, 8);
		
		sc.close();
	}

}
