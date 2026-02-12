package pst;

import java.util.Scanner;

public class Ascii2 {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("enter the value:");
			int num = sc.nextInt();
			value(num);
	}
 static void value(int num) {
	 char ascii= (char) num;
	 System.out.println(ascii);
 }
}
