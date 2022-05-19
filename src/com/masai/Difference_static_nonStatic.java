package com.masai;

class Main {
	 
	 int x=10; //instance variable
	 int y=5;  //instance variable
	 int sum(int a, int b) //instance method
	 {
		 return a+b;
	 }
	 static int a=4; //static variable
	 static int b=6;  //static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling non static variable
		Main s= new Main();
		System.out.println(s.x+" + "+s.y +"="+s.sum(s.x,s.y));
		//calling static variable
		System.out.println(Main.a+" + "+Main.b +"="+s.sum(Main.a,Main.b));

	}

}
