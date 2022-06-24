package com.valeria.parentheses;

public class MinimumAddToMakeParenthesesValid {

	public int minAddToMakeValid(String S) {

		int leftParentheses = 0;
		int rightParentheses = 0; 
		int totalAddOfParenthesis = 0;

		if (S == null || S.length() >= 1000) {
			return -1;
		}

		for (int i = 0; i < S.length(); i++) {
			
			if(S.charAt(i) != '(' && S.charAt(i) != ')') {
				return -1;
			}

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
