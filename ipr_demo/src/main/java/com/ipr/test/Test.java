package com.ipr.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	Long value =  1546513662000L;
	SimpleDateFormat originalFormat = new SimpleDateFormat("yyyyMMdd");
	Date date = originalFormat.parse(value.toString());
	System.out.println(date);
	
	long timestamp = 1546513662000L; //Example -> in ms
	Date d = new Date(timestamp );
	
	System.out.println(d);
	
	DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
	String requiredDate = df.format(d).toString();
	System.out.println(requiredDate);
	
} catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
}
		
	}

}
