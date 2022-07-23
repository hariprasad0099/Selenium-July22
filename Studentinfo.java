package org.assignment4;

public class Studentinfo {
	public void getStudentInfo(int id) {
		System.out.println("Can find Student name with ID"); 
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Can find student with id and name");
	}
	
	public void getStudentInfo(String email , String name , long phnumber) {
		System.out.println("can find student with email , name ,phnumber ");
	}
	
	public static void main(String[] args) {
		Studentinfo info = new Studentinfo();
		info.getStudentInfo(96297 , "Hariprasad");
	}

}
