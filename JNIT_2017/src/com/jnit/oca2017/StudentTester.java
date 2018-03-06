package com.jnit.oca2017;

public class StudentTester {
	
	public static void main(String[] args) {

		
		
		Student student = new Student();
		System.out.println("First Name is"+ student.getFirstName());
		
		
		Student student2 = new Student("Anusha", "Tiyyagura", "Flower Mound");
		System.out.println(student2.getFirstName());
		System.out.println(student2.getLastName());
		System.out.println(student2.getAddress());
		Student s3 = student;
		
		
		System.out.println(student==s3);
	}
}