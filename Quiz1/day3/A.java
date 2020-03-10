package com.capgemini.Quiz.day3;

public class A {
	int i;
	A(){
	i=0;
	System.out.println(i);
	}
 A(int x){
	 i=x+1;
	 System.out.println(i);
	 
 }
 
 A(int y,int x){
	 i=x+y;
	 System.out.println(i);
 }
 public static void main(String[] args) {
	 A a=new A(10);
	 A b=new A(110,20);//(answer) obj two will constructor A(int y,int x)
	 A c=new A();
	 
	
}
}

