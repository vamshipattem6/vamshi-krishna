package com.capgemini.Quiz.day2;

public class Question2 {
static int a;
 
static
{
	a=4;
	System.out.println("inside static blockn");
	System.out.println("a="+a);
}
Question2(){
	System.out.println("ninsisde constructorn");
	a=10;
}
public static void func() {
	a=a+1;
	System.out.println("a ="+a);
}
public static void main(String[] args) {
	Question2 q2 = new Question2();
	q2.func();
}
}
