package ezen2024_java.ch07.third;

public class Student extends People {
	private int studentNo;
	
	Student () {}

	
	
	public Student(int studentNo) {
		this.studentNo = studentNo;
	}

	public Student(int studentNo, String name , String ssn) {
		super (name,ssn);
		this.studentNo = studentNo;
	}


	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	@Override
	public void print() {
		System.out.println("People [name=" + getName() + ", ssn=" + getSsn() + ", studentNo="+ studentNo + "]");
	}
	
}
