package ezen2024_java.ch06;

import ezen2024_java.second.HandBack;

public class ExCar {

	public static void main(String[] args) {

		Car car = new Car();
		car.setBrand("Benz");
		car.setName("S class");
		car.setCarType(1);
		car.setPower(503.12);

		System.out.println(car.toString());
		System.out.println("=====================");

		Car car2 = new Car();
		car2.setBrand("현대");
		car2.setName("차종을모릅니다..");
		car2.setCarType(1);
		car2.setPower(1000.12);
		System.out.println(car2.toString());
		System.out.println("=====================");

		Car car3 = new Car();
		car3.setBrand("기아");
		car3.setName("진짜 몰라요...2");
		car3.setCarType(1);
		car3.setPower(1000.12);
		System.out.println(car3.toString());
		System.out.println("=====================");

		SportsCar scar = new SportsCar();
		scar.setBrand("스포츠카브랜드");
		scar.setName("진짜 몰라요...3");
		scar.setCarType(1);
		scar.setPower(10000.12);
		System.out.println(scar.toString());
		System.out.println("=====================");

		car.back();
		car.go();
		car.left();
		car.right();
		
		HandBack handBack = new HandBack();
		
	}

}
