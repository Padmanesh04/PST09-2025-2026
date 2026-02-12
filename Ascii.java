package pst;
import java.util.Scanner;
public class Ascii {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the character:");
		char c=sc.next().charAt(0);
		value(c);
	}
static void value(char c) {
	 int ascii = c;
	 System.out.println(ascii);
}
}
