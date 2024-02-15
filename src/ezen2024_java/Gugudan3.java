package ezen2024_java;

public class Gugudan3 {
	public static void main(String[] args) {

		for (int i = 1; i <= 9; i++) {
			int sum = 0;
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
				sum += i*j;
				
				if (j == 9) {
					
					System.out.println(i + "단 합 =" + sum);
				}
			}			
			System.out.println("----------------");
		}
	}
}
