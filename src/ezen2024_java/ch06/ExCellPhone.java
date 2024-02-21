package ezen2024_java.ch06;

import ezen2024_java.ch07.CellPhone;
import ezen2024_java.ch07.Phone;

public class ExCellPhone {
	public static void main(String[] args) {
		
		Phone phone = new Phone();
		CellPhone cellPhone = new CellPhone();
		
		phone.setColor("파랑");
		phone.setModel("스마트폰");
		System.out.println(phone.toString());
		
		cellPhone.setTelecom("lg");
		cellPhone.setColor("흰색");
		cellPhone.setModel("스마트폰555");
		System.out.println(cellPhone.toString()+cellPhone.getColor());
		System.out.println("---------------------------");
		phone.powerOff();
		phone.powerOn();
		System.out.println("------------오버라이드---------------");
		cellPhone.powerOff();
		cellPhone.powerOn();
		
		
		System.out.println("이렇게 안쓰지만 실험상");
		cellPhone.powerOffCellPhone();
		cellPhone.powerOnCellPhone();
	}
}
