package ezen2024_java;



public class Gugudan2 {
	public static void main(String[] args) {
		
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j+=2) {
				System.out.println(i+"x"+j + "=" + i*j );
				
			}
			System.out.println("----------------");
		}
	}
}
