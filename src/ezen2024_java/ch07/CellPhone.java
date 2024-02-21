package ezen2024_java.ch07;

public class CellPhone extends Phone {
	private String telecom;
	
	public CellPhone() {}

	public CellPhone(String telecom) {
		super();
		this.telecom = telecom;
	}

	public String getTelecom() {
		return telecom;
	}

	public void setTelecom(String telecom) {
		this.telecom = telecom;
	}
	
	
	@Override
	public String toString() {
		return "CellPhone [telecom=" + telecom + "]";
	}

	//메소드
	public void powerOnCellPhone () {
		System.out.println(telecom+"전원킴1");
	}
	
	public void powerOffCellPhone () {
		System.out.println(telecom+"전원끔1");
	}

	@Override
	public void powerOn() {
		System.out.println(telecom+"전원킴");
	}

	@Override
	public void powerOff() {
		System.out.println(telecom+"전원끔");
	}
	
	
	
	
}