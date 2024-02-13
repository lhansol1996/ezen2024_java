package ezen2024_java;


public class test2 {
	public static void main(String[] args) {
		int x;
		String str;
		for (x = 0; x <= 100; x++) {
			if (x % 2 == 0) {
				str = "짝수";
				System.out.println(str);
			} else if (x % 2 == 1) {
				str = "홀수";
				System.out.println(str);
			}

		}

	}
}
