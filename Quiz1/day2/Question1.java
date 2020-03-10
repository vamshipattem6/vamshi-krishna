package com.capgemini.Quiz.day2;

public class Question1 {
int t=20;
Question1(){
	t=40;
}
}
class Main{
	public static void main(String args[]){
		Question1 q1 = new Question1();
		System.out.println(q1.t);// answer will be 40
	}
}