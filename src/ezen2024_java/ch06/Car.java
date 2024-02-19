package ezen2024_java.ch06;

public class Car {
	String brand;
	String name;
	int carType;
	double power;
	
	Car () {}
	
	public Car(String brand, String name, int carType, double power) {
		this.brand = brand;
		this.name = name;
		this.carType = carType;
		this.power = power;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCarType() {
		return carType;
	}

	public void setCarType(int carType) {
		this.carType = carType;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", name=" + name + ", carType=" + carType + ", power=" + power + "]";
	}
	
	public void go () {
		System.out.println("차가 감");
	}
	
	public void back () {
		System.out.println("차가 뒤로감");
	}
	
	public void right () {
		System.out.println("우회전");
	}
	
	public void left () {
		System.out.println("좌회전");
	}
	
	
	
}
