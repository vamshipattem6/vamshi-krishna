package com.capgemini.Quiz.day3;

public class Question7 {
static void t() {
	int i=1;
}
   static class B extends Question7{
	static void t() {
		int i=2;
	System.out.println(i);
}
	public  static void main(String[] args) {
			t();
		
	}
 }
}


