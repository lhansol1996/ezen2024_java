package ezen2024_java.ch07.second;

public class HandBack extends Back {
	double price;

	HandBack () {}
	public HandBack(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "HandBack [브랜드=" + getBrand() + ", 모델=" + getModel() + ", 가격= "+price+"]";
	}
	
	@Override
	public void print() {
		System.out.println("HandBack [브랜드=" + getBrand() + ", 모델=" + getModel() + ", 가격= "+price+"]");
	}
}
