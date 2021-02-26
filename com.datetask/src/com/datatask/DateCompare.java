package com.datatask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCompare {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("DateFormat :-" + "yyyy-MM-dd");

		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		compareDate(s1, s2);
		sc.close();

	}

	public static String compareDate(String s1, String s2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String result = "";
		Date d1 = sdf.parse(s1);
		Date d2 = sdf.parse(s2);

		System.out.println("Date1 : " + sdf.format(d1));
		System.out.println("Date2 : " + sdf.format(d2));

		if (d1.after(d2)) {
			result = "Date1 is after Date2";

		} else if (d1.before(d2)) {
			result = "Date1 is before Date2";

		}

		else if (d1.equals(d2)) {
			result = "Date1 is equal Date2";

		}
		System.out.println(result);

		return result;
	}

}
