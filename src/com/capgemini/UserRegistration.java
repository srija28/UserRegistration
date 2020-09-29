package com.capgemini;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class UserRegistration {
	public void firstNameValidator(String firstName) {
		Pattern pattern = Pattern.compile("^([A-Z])[a-zA-Z]{2,}$");
		Matcher matcher = pattern.matcher(firstName);
		Boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("First Name is Validated");
		} else {
			System.out.println("Please check your input");
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page");
		System.out.println("Please enter your name where the first letter should be capital and have min 3 characters:");
		Scanner sc = new Scanner(System.in);
		UserRegistration u = new UserRegistration();
		u.firstNameValidator(sc.next());

	}

}
