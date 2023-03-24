package cycle2;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String Str1 = sc.nextLine();
		System.out.println("Enter the String 2:");
		String Str2 = sc.nextLine();
		System.out.println("Enter a character:");
		String ch = sc.next();
		System.out.println("Enter a number:");
		int n = sc.nextInt();

		System.out.println("1-Is string1 Empty :" + Str1.isEmpty());
		System.out.println("2-Length of the String1 :" + Str1.length());
		System.out.println("3-String1 to Upper case:" + Str1.toUpperCase());
		System.out.println("4-String1 to Lower case:" + Str1.toLowerCase());
		System.out.println("5-Character at index 2 in String1 " + Str1.charAt(2));
		System.out.println("6-concat String1 and String2 " + Str1.concat(Str2));
		System.out.println("7-Strings are equal or not: " + Str1.equals(Str2));
		System.out.println("8-Does String1 starts with character entered:" + Str1.startsWith(ch));
		System.out.println("9-Does String1 ends with character entered:" + Str1.endsWith(ch));

		System.out.println(
				"10-codePointAt():Returns the Unicode of the character at the specified index: " + Str1.codePointAt(0));

		System.out.println("11-First occuarance of character entered in the String1:" + Str1.indexOf(ch));
		System.out.println("12-Last occuarance of character entered in the String1:" + Str1.lastIndexOf(ch));
		System.out.println("13-Character at position in String1:" + Str1.charAt(n));

		sc.close();

	}

}