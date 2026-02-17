package pst;

import java.util.Scanner;

public class Ascii7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the character:");
		char st = sc.next().charAt(0);
		menu(st);
	}
static void menu(char st) {
	int ascii=st;
	System.out.println(ascii);
	if (ascii>=65 && ascii<=90) {
		System.out.println("IT IS A UPPERCASE LETTER");
	}else if (ascii>=97 && ascii<=122) {
		System.out.println("IT IS A lOWERCASE LETTER");
	}
	else {
			System.out.println(" ITS NOT A LETTER");
		}
}
}
