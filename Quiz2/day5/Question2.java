package com.capgemini.Quiz.day5;

public class Question2 {
	public String function(String temp,int data) {
		return("Question_4");
	}
	private String function(int data,String temp) {
		return("This is Question_4");
	}
	public static void main(String[] args) {
		Question2 q=new Question2();
		System.out.println(q.function(4,"Question_4"));
	}
}

