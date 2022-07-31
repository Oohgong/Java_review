package com.rw.object;

public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); //false -> 문자열의 주소를 비교 
		System.out.println(str1.equals(str2)); //true -> 논리적, 문자열의 내용이 같으면 같음

	}

}
