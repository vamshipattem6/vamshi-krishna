package com.capgemini.Quiz.day2;

public class Question9 {
public static void main(String[] args) {
	for(int i=0;i<3;i++) {
		for(int j=1;j<4;j++) {
			i%=j;
			System.out.println(j);
		}
	}
}
}
