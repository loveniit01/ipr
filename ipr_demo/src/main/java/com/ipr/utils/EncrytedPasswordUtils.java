package com.ipr.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EncrytedPasswordUtils {

	// Encryte Password with BCryptPasswordEncoder
	public static String encrytePassword(String password) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder.encode(password);
	}

	/*
	 * public static void main(String[] args) { String password = "admin"; String
	 * encrytedPassword = encrytePassword(password);
	 * 
	 * System.out.println("Encryted Password: " + encrytedPassword); }
	 */

}
