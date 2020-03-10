package com.capgemini.Quiz.day1;

public class Question2 {
	public static void main(String[] args) {

		loop1: for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= 5; j++) {
				if (j == 3) {
					break loop1;
				}
				System.out.println("sample");
			}
		}

	}
}
