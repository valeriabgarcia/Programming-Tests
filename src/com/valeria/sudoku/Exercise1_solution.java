package com.valeria.sudoku;

import java.util.HashSet;

public class Exercise1_solution {

	public boolean isValidSudoku(int[][] board) {

		for(int i = 0; i < 9; i++) {

			HashSet<Integer> rows = new HashSet<Integer>();
			HashSet<Integer> columns = new HashSet<Integer>();
			HashSet<Integer> subBoxes = new HashSet<Integer>();	

			for(int j = 0; j < 9; j++) {
			
				if(board[i][j] != '.' && board[i][j] <= '0' || board[i][j] > '9') {
					return false;
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
