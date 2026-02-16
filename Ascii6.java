package pst;

import java.util.Scanner;

public class Ascii6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the string:");
		String str = sc.next();
		menu(str);
	}
    static void menu(String str) {
    	int z=0;
    	for (int i=0;i<=str.length()-1;i++) {
    		int a= str.charAt(i);
    		 z+=a;
    	}
    	System.out.println(z);
    }
}
