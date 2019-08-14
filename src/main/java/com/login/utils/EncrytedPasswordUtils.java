package com.login.utils;
import java.text.Normalizer;
import java.util.regex.Pattern;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class EncrytedPasswordUtils {
	  public static String encrytePassword(String password) {
	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	        return encoder.encode(password);
	    }
public static String removeAccent(String s) {
		  
		  String temp = Normalizer.normalize(s, Normalizer.Form.NFD);
		  Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
		  return pattern.matcher(temp).replaceAll("").replace('đ','d').replace('Đ','D');
		 }
	  public static void main(String[] args) {
	        String password = "123";
	        String encrytedPassword = encrytePassword(password);
	 
	        System.out.println("Encryted Password: " + encrytedPassword);
	        System.out.println(removeAccent("ă â ư ô ơ đ ê á ấ "));
	    }
}
