package ezen2024_java.ch07.second;

public class Back {
	private String brand;
	private String model;
	
	Back () {}

	public Back(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Back [브랜드=" + brand + ", 모델=" + model + "]";
	}
	
	public void print() {
		System.out.println("Back [브랜드=" + brand + ", 모델=" + model + "]");
	}
	
	
}
