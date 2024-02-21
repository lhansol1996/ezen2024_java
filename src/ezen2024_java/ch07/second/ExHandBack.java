package ezen2024_java.ch07.second;

public class ExHandBack {
	public static void main(String[] args) {
		
		HandBack handBack = new HandBack();
		handBack.setBrand("브랜드1");
		handBack.setModel("모델1");
		handBack.setPrice(9999.999);
		
		handBack.print();
		System.out.println(handBack.toString());
		
		
	}
}
