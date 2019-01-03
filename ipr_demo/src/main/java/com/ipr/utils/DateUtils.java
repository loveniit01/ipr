package com.ipr.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class DateUtils {

	public DateUtils() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * public static void main(String... strings ) { DateFormat dateFormat = new
	 * SimpleDateFormat("yyyy/MM/dd"); Date date = new Date(); String aa=
	 * dateFormat.format(date); String[] date__ = aa.split("/"); return date__; }
	 */

	public String[] currdate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date date = new Date();
		String aa = dateFormat.format(date);
		String[] date__ = aa.split("/");
		return date__;
	}
	
	public String dateConversion(Long date__)
	{
		Date d = new Date(date__ );
		DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		return df.format(d).toString();
	}

}
