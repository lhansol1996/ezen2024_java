package ezen2024_java.ch15;

public class Language {
	
	private String name;
	private int version;
	
	public Language() {}
	public Language(String a, int b) {
		setName(a);
		setVersion(b);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	
	
	
	
	
}
