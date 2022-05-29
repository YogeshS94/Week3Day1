package student;

import college.College;
import department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Student Name: ASSASASASAS");
	}
	public void studentDept() {
		System.out.println("Student Department: aEDasdtf");
	}
	public void studentId() {
		System.out.println("Student ID: E12432341234");
	}
	public static void main(String arg[]) {
		Student st = new Student();
		
		// College Class methods
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		
		//Department Class methods
		st.deptName();
		
		//Student Class methods
		st.studentId();
		st.studentName();
		st.studentDept();
	}
}
