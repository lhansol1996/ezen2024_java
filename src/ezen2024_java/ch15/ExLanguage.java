package ezen2024_java.ch15;

import java.util.ArrayList;
import java.util.List;

public class ExLanguage {
	
	public static void main(String[] args) {
		
		
		ArrayList<Language> arrayList = new ArrayList<Language>();
		List<Language> list = new ArrayList<Language>();
		
		List<String> list2s = new ArrayList<String>();
//		list2.set(1, "StringData");
//		list2.set(2, "StringData");
		
		list2s.add("stringData1");
		list2s.add("stringData2");
		list2s.add("stringData3");
		list2s.add("stringData4");
		
		for (String list2 : list2s) {
			System.out.println(list2);
		}
		
		for (int i = 0; i < list2s.size(); i++) {
			System.out.println(list2s);
		}
		
	/*
		두 구문은 같은 결과를 나타내지만 arrayList가 List 인터페이스를 구현하기 때문에 
		2번째 구문으로 표현하는게 이론적으로 더 올바름 추후 , 문제가 생겨도 수정 보완이 유리.
	*/
		
		
	}
}
