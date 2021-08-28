package week3.day1;

import week3.day1.College;
import week3.day1.Department;

public class Student extends Department {
	public void studentName()
	{
		System.out.println("Dinesh");
	}
	public void studentDept()
	{
		System.out.println("MECH");
	}
	public void studentId()
	{
		System.out.println("1109898");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******College*******");
		College C=new College();
		C.collegeCode();
		C.collegeName();
		C.collegeRank();
		System.out.println("*******Department*****");
		Department D=new Department();
		D.deptName();
		D.collegeCode();
		D.collegeName();
		D.collegeRank();
		System.out.println("*******Student*******");
		Student S=new Student();
		S.studentDept();
		S.studentId();
		S.studentName();
		S.collegeCode();
		S.collegeName();
		S.collegeRank();
	}

}
