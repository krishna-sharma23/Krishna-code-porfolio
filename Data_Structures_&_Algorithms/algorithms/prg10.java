package algorithms;

//Backtracking

import java.util.*;

public class prg10 {
	
	static List<List<String>> NQueens(int n){
		List<List<String>> allBoards = new ArrayList<>();
		char[][] board = new char[n][n];
		helper(allBoards, board, 0);
		return allBoards;
	}

	private static void helper(List<List<String>> allBoards, char[][] board, int col) {
		// TODO Auto-generated method stub
		if(col == board.length) {
			saveboard(allBoards, board);
			return;
		}
		
		for(int row = 0; row < board.length; row++) {
			if(isSafe(row, col, board)) {
				board[row][col] = 'Q';
				helper(allBoards, board, col + 1);
				board[row][col] = '.';
			}
		}
		
	}

	private static boolean isSafe(int row, int col, char[][] board) {
		// TODO Auto-generated method stub
		//Horizontal
		for(int c = 0; c < col; c++) {
			if(board[row][c] == 'Q') return false;
		}
		
		//Upper Left
		
		for(int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
			if(board[r][c] == 'Q') return false;
		}
		
		//Lower left
		for(int r = row, c = col; r < board.length && c >=0; r++, c--) {
			if(board[r][c] == 'Q') return false;
		}
		
		return true;
	}

	private static void saveboard(List<List<String>> allBoards, char[][] board) {
		// TODO Auto-generated method stub
		String temp = "";
		List<String> newBoard = new ArrayList<>();
		for(int i = 0; i < board.length; i++) {
			temp = "";
			for(int j = 0; j < board.length; j++) {
				if(board[i][j] == 'Q') temp += "Q";
				else temp += ".";
			}
			newBoard.add(temp);
		}
		allBoards.add(newBoard);
	}

	public static void main(String[] args) {
		System.out.println(NQueens(4));
	}

}
