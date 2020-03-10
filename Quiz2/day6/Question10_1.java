package com.capgemini.Quiz.day6;

public class Question10_1 {
		Question10 op;// aggregation
		double pi = 3.14;

		double area(int radius) {
			op = new Question10();
			int rsquare = op.square(radius);// code reusability.
			return pi * rsquare;
		}
	}


