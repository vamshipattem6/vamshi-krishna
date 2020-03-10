package com.capgemini.Quiz.day7;

public class Question7 {
	public static void main(String[] args) {
		int a = 260;
		byte b= (byte)a;
		System.out.println(b);

	}

}
/*
 * If a number is too big for a data type, it applies Modulo Division by the
 * highest number possible of that data type. Byte range is -128 to +127. 260 >
 * 256. So, modulo division is applied.
 * 
 * 260%256 = 4

 */

