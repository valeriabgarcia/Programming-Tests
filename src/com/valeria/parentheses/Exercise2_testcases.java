package com.valeria.parentheses;

public class Exercise2_testcases {

	public static void main(String[] args) {

		MinimumAddToMakeParenthesesValid parenthesisString = new MinimumAddToMakeParenthesesValid();

		System.out.println(parenthesisString.minAddToMakeValid(""));
		System.out.println(parenthesisString.minAddToMakeValid("A"));
		System.out.println(parenthesisString.minAddToMakeValid("()"));
		System.out.println(parenthesisString.minAddToMakeValid("("));
		System.out.println(parenthesisString.minAddToMakeValid(")"));
		System.out.println(parenthesisString.minAddToMakeValid("((("));
		System.out.println(parenthesisString.minAddToMakeValid("((()"));

	}
}
