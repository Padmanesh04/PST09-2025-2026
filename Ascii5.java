package pst;

import java.util.Scanner;
public class Ascii5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string:");
		String str = sc.next();
		menu(str);
	}
    static void menu(String str) {
    	for (int i=0;i<=str.length()-1;i++) {
    		int a = str.charAt(i);
    		System.out.println(a);
    	}
	
    }
}
