package com.capgemini.Quiz.day4;

public class Question9 {
		private String function(float i, int f) {
			return ("Question_5");
		}

		private String function(double i, double f) {
			return ("This is Question_4");
		}

		public static void main(String[] args) {
			Question9 q = new Question9();
			System.out.println(q.function(1.0, 20));//it executes 2nd private method because we have 
			                                       //not given value with f,in the arguments
			
		}
	}

