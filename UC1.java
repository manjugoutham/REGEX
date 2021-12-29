package com.java.regex.Regexuc1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

class UC1 {

	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<String> lastname = new ArrayList<String>();
	static ArrayList<String> emails = new ArrayList<String>();
	static ArrayList<String> numbers = new ArrayList<String>();
	static ArrayList<String> ch = new ArrayList<String>();
	static ArrayList<String> uppercase = new ArrayList<String>();

	public void firstname() {
		names.add("Java");
		names.add("basics");
		String regex = "[A-Z]{1}[a-z]{3}";

		Pattern p = Pattern.compile(regex);

		for (int i = 0; i < names.size(); i++) {
			Matcher m = p.matcher(names.get(i));
			System.out.println("The First name is :");
			System.out.println(names.get(i) + "->" + m.matches());
		}
	}

	public void lastname() {
		lastname.add("Na");
		lastname.add("Naiz");
		String regex = "[A-Z]{1}[a-z]{3}";

		Pattern p = Pattern.compile(regex);

		for (int i = 0; i < lastname.size(); i++) {
			Matcher m = p.matcher(lastname.get(i));
			System.out.println("The Last name is :");
			System.out.println(lastname.get(i) + "->" + m.matches());
		}
	}

	public void validemail() {
//		emails.add("user@domain.com");
//		emails.add("user@domain.co.in");
//		emails.add("user.name@domain.com");
		emails.add("Abc.xyz@domain.bl.co.in");
		emails.add("abc_xyz@domain.co.in");

		// Invalid emails
		emails.add("@yahoo.com");

		String regex = "[A-Za-z0-9_.-]+@(.+)";

		Pattern pattern = Pattern.compile(regex);

		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			System.out.println("The valid and invalid emails are :");
			System.out.println(email + " : " + matcher.matches());
		}
	}

	public void mobileformat() {
		numbers.add("91 9105566743");
		numbers.add("12 9134556789");

		String regex = "(0|91 )[9][0-9]{9}";

		Pattern pattern = Pattern.compile(regex);

		for (String number : numbers) {
			Matcher matcher = pattern.matcher(number);
			System.out.println(number + " : " + matcher.matches());
		}
	}

	public void character() {
		ch.add("Loki");
		ch.add("Lokes2hes");
		String regex = "[A-Za-z]{8,}";

		Pattern pattern = Pattern.compile(regex);

		for (String chs : ch) {
			Matcher matcher = pattern.matcher(chs);
			System.out.println("The character are :");
			System.out.println(chs + " : " + matcher.matches());
		}
	}

	public void rule2() {
		uppercase.add("advanced");
		uppercase.add("coreJava");
		String regex = "^(?=.*[a-z])(?=.*[A-Z]){8,}.*$";

		Pattern pattern = Pattern.compile(regex);

		for (String rule : uppercase) {
			Matcher matcher = pattern.matcher(rule);
			System.out.println("Should have at least Upper Case :");
			System.out.println(rule + " : " + matcher.matches());
		}
	}

	
	public static void main(String args[]) {

		UC1 obj = new UC1();
		obj.rule2();

	}
}