package pst;

import java.util.Scanner;

public class Convertstrtochararray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a String :");
		 String s =sc.next();
		 char[] arr= new char[s.length()];
			for (int i=0;i<s.length();i++) {
				arr[i]=s.charAt(i);
				System.out.println(arr[i]);
			}
	}

}
