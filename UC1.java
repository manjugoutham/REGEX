package com.java.regex.Regexuc1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

class UC1 {

	static ArrayList<String> names = new ArrayList<String>();
	static ArrayList<String> lastname = new ArrayList<String>();

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
	
	public static void main(String args[]) {

		UC1 obj = new UC1();
		obj.lastname();

	}
}