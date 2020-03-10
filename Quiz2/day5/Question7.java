package com.capgemini.Quiz.day5;

public class Question7 {
	static{
        System.out.println("static");
  }

  {
        System.out.println("block");
  }

  public Question7(){
        System.out.println("A");
  }

  public static void main(String[] args){
	  Question7 q= new Question7();
  }

}

