package com.valeria.parentheses;

public class Exercise2_solution {

	public int minAddToMakeValid(String S) {

		int leftParentheses = 0;
		int rightParentheses = 0; 
		int totalAddOfParenthesis = 0;

		if (S.length() < 1 || S.length() >= 1000 || !S.contains("(") && !S.contains(")")) {
			return -1;
		}

		for (int i = 0; i < S.length(); i++) {

			if(S.charAt(i) == '(') {				
				rightParentheses++;
			}
			else if (rightParentheses > 0){ 
				rightParentheses--;
			} 
			else {
				leftParentheses++;
			}
		}

		totalAddOfParenthesis = leftParentheses + rightParentheses;
		
		return totalAddOfParenthesis; 
	}
}
