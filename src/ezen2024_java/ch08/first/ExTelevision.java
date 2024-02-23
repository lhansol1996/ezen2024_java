package ezen2024_java.ch08.first;

/*
 * 인터페이스를 상속한 클래스를 실행하는 방법
 * 클래스를 생성할 때 객체생성 객체를 클래스가아닌 상속받은 인터페이스를 선언
 * 생성자를 선언할 때 사용할 클래스를 선언하는 식으로 생성
 */


public class ExTelevision {
	public static void main(String[] args) {
		RemoteControl remoteControl = new Television();
		remoteControl.turnOff();
		remoteControl.turnOn();
		
	
		RemoteControl remoteControl2 = new Radio();
		remoteControl2.turnOn();
		remoteControl2.turnOff();
		
		
	}
}	 
