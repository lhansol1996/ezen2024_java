package ezen2024_java.ch06;

public class SportsCar {
	String brand;
	String name;
	int carType;
	double power;
	
	SportsCar () {}
	
	public SportsCar(String brand, String name, int carType, double power) {
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
	
	
	
	
	
}
