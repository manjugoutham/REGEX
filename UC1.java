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
	static ArrayList<String> numeric = new ArrayList<String>();
	static ArrayList<String> specialchar = new ArrayList<String>();
	static ArrayList<String> emailtest = new ArrayList<String>();

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

	public void rule3() {
		numeric.add("javabasic");
		numeric.add("wonderFul2");

		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]){8,}.*$";

		Pattern pattern = Pattern.compile(regex);

		for (String value : numeric) {
			Matcher matcher = pattern.matcher(value);
			System.out.println("The numeric number is :");
			System.out.println(value + " : " + matcher.matches());
		}
	}

	public void rule4() {
		specialchar.add("corejava");
		specialchar.add("advance2@");

		String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[-+(){}_!@#$%^&*., ?]){8,}.*$";

		Pattern pattern = Pattern.compile(regex);

		for (String spchar : specialchar) {
			Matcher matcher = pattern.matcher(spchar);
			System.out.println("The Special Character are :");
			System.out.println(spchar + " : " + matcher.matches());
		}
	}

	public void sampleemailstotest() {
		emailtest.add("abc@yahoo.com");
		emailtest.add("abc-100@yahoo.com");
		emailtest.add("abc.100@yahoo.com");
		emailtest.add("abc111@abc.com");
		emailtest.add("abc-100@abc.com");
		emailtest.add("abc.100@abc.com.au");
		emailtest.add("abc@1com");
		emailtest.add("abc@gmail.com.com");
		emailtest.add("abc+100@gmail.com");

		// Invalid emails
		emailtest.add("@yahoo.com");
		emailtest.add(".yahoo.com");
		emailtest.add("..yahoo.com");
		emailtest.add("abc@abc@gmail.com");
		emailtest.add("abc@%*.com");
		

		String regex = "^(.+)@(.+)$";

		Pattern pattern = Pattern.compile(regex);

		for (String test : emailtest) {
			Matcher matcher = pattern.matcher(test);
			System.out.println("The valid and invalid emails are :");
			System.out.println(test + " : " + matcher.matches());
		}
	}

	public static void main(String args[]) {

		UC1 obj = new UC1();
//		obj.firstname();
//		obj.lastname();
//		obj.validemail();
//		obj.mobileformat();
//		obj.character();
//		obj.rule2();
//		obj.rule3();
//		obj.rule4();
		obj.sampleemailstotest();

	}
}