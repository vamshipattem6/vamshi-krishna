package com.capgemini.Quiz.day1;

public class Question5 {
public static void main(String[] args) {
	int a,b,c,d;
	a=b=c=d=20;
	a+=b=c*=d/=20;
	System.out.println(a+" "+b+" "+c+" "+d);
}
}
