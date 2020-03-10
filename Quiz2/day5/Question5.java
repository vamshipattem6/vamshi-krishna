package com.capgemini.Quiz.day5;

public class Question5 {
	private double radius;

	public Question5(double radius) {
		radius=radius;
		System.out.println(radius);

	}

	void display() {
		System.out.println(radius);
	}

	public static void main(String[] args) {
		Question5 q = new Question5(10);
		q.display();

	}

}

/*
 * The program will compile, but we cannot create an object of Circle with a
 * specified radius. The object will always have radius 0.
 */

