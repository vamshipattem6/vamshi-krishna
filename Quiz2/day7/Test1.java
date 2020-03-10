package com.capgemini.Quiz.day7;

public class Test1 extends Thread {
	public static void main(String[] args) {
		Question_1_3 b=new Question_1_3();
		if(b instanceof Question_1) {
			System.out.println("b is an instance of Question_1");
		}
		if(b instanceof Question_1_1) {
			System.out.println("b is an instance of Question_1_1");
		}
	}}
