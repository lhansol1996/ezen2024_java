package ezen2024_java.ch07.third;

public class People {
	private String name;
	private String ssn;
	
	People () {}
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public void print() {
		System.out.println("People [name=" + name + ", ssn=" + ssn + "]");
	}
	
	
}
