package com.valeria.sudoku;

import java.util.HashSet;

public class ValidSudoku {

	public boolean isValidSudoku(int[][] board) {
		
		if(board == null) {
			return false;
		}
		
		if(board.length != 9) {
			return false;
		}

		for(int i = 0; i < 9; i++) {
			
			if(board[i].length != 9) {
				return false;
			}

			HashSet<Integer> rows = new HashSet<Integer>();
			HashSet<Integer> columns = new HashSet<Integer>();
			HashSet<Integer> subBoxes = new HashSet<Integer>();	

			for(int j = 0; j < 9; j++) {
			
				if(board[i][j] != '.' && board[i][j] <= '0' || board[i][j] > '9') {
					return false;
				}
				
				// verify
				if(board[i][j] == '.') {
					continue;
				}

				if(board[i][j] != '.'  && !rows.add(board[i][j])) {
					return false;
				}

				if(board[j][i] != '.' && !columns.add(board[j][i])) {
					return false;
				}			

				int rowsIndex = 3 * (i / 3); 
				int columnsIndex = 3 * (i % 3); 

				if(board[rowsIndex + j / 3][columnsIndex + j % 3] != '.' 
						&& !subBoxes.add( board[rowsIndex + j / 3][columnsIndex + j % 3])) {	
					return false;	
				}
			}
		}
		return true;		
	}
}
