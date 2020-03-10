package com.capgemini.Quiz.day2;

public class Question6 {
public static void main(String[] args) {
	int a=189;
	int b=152;
	int c= minnumber(a, b);
	System.out.println("minimum value ="+c);
}
static int minnumber(int n1,int n2) {
	int min;
	if(n1 > n2) {
		min = n2;
	}else {
		min=n1;
	}
	return min;
}
}
