package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	//studentName(),studentDept(),studentId()
	
	public void studentName() {
		System.out.println("The name of the student is M.Hariprasad");
	}
	
	public void studentDept() {
		System.out.println("The name of the student is Mechanical");
	}
	
	public void studentId() {
		System.out.println("The name of the studentID is 814711114026");
	}
public static void main(String[] args) {
	
	Student myProfile = new Student();
	myProfile.collegeName();
	myProfile.collegeCode();
	myProfile.collegeRank();
	myProfile.departmentName();
	myProfile.studentName();
	myProfile.studentId();
	myProfile.studentDept();

	
}
}
