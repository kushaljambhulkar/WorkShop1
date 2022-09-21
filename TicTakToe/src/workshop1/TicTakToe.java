package workshop1;

import java.util.*;

public class TicTakToe {

	static int player = 0;
	static int[][] Board = new int[3][3];
	static boolean isEmpty = true;
	
	static void initBoard() {
		System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer is X");
		for(int i = 0; i < Board[i].length; i++)
		{
			Board[i] = -10;
		}
	}
	System.out.println("Board is This :");
	dispBoard();
}

static void dispBoard() {
	int count = 0;
	for(int i = 0; i < Board.length; i++)
	{
		System.out.println("--------");
		System.out.print("||");
	}
	
	public static void main(String args[])
	{
		System.out.println("***Wlcome to Tic Tak Toe Board***");
	}
}
