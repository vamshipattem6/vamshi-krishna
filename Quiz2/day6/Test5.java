package com.capgemini.Quiz.day6;

public class Test5 {
		int id;  
		String name;  
		Question5 address;  
		  
		public Test5(int id, String name,Question5 address) {  
		    this.id = id;  
		    this.name = name;  
		    this.address = address;  
		}  
		  
		void display(){  
		System.out.println(id+" "+name);  
		System.out.println(address.city+" "+address.state+" "+address.country);  
		}  
		  
		public static void main(String[] args) {  
		Question5 address1=new Question5("nirmal , ","telangana , ","india");  
		Question5 address2=new Question5("nirmal , ","telangana , ","india");  
		  
		Test5 e=new Test5(547,"dikshith",address1);  
		Test5 e2=new Test5(523,"datta",address2);  
		      
		e.display();  
		e2.display();  
		      
		}  
	}

