package com.capgemini.Quiz.day4;

public class Testinterface3 implements Question6Printable,Showable {
	
	public void print() {
		System.out.println("hello");
	}
	
public static void main(String[] args) {
	Testinterface3 t = new Testinterface3();
	t.print();
}
}
