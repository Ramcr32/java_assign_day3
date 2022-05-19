package com.masai;

public class Student {
	int roll;
	String name;
	int marks;
	void displayStudentDetails() {
		System.out.println("Roll is : "+this.roll);
		System.out.println("Name is : "+this.name);
		System.out.println("Marks is : "+this.marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student();
		Student syam = new Student();
		//ram instance
		ram.roll=1;
		ram.name="ram";
		ram.marks=500;
		//syam intance
		syam.roll=2;
		syam.name="syam";
		syam.marks=600;
		ram.displayStudentDetails();
	}
	

}
//class Student {
//	
//}
