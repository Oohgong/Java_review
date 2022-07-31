package com.rw.Calendar;

import java.util.Calendar;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance();
		
		Company c2 = Company.getInstance();
		
//		Company c3 = new Company(); //ERROR
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1 == c2); //true
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTimeInMillis());

	}

}
