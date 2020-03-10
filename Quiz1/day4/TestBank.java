package com.capgemini.Quiz.day4;

public class TestBank {
	public static void main(String[] args) {
		Question3Bank q;
		q = new Sbi();

		System.out.println("Rate of interest is:" + q.getRateOfinterest() + "%");

		System.out.println("==================================");

		q = new Pnb();
		System.out.println("Rate of interest is:" + q.getRateOfinterest() + "%");
	}
}
