package ezen2024_java.ch07;

public class Phone {
	private String model;
	private String color;
	
	public Phone() {}
	

	public Phone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

	@Override
	public String toString() {
		return "Phone [model=" + model + ", color=" + color + "]";
	}


	//메소드
	public void powerOn() {
		System.out.println(model+"전원 킴");
	}
	
	public void powerOff() {
		System.out.println(model+"전원 끔");
	}
	
	
	
	
	
}