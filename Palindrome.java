package pst;

import java.util.Scanner;
public class Palindrome { 
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
	     System.out.print("Enter a string: ");	
	     String org =sc.nextLine();
	     String rev="";
	     for(int i=org.length()-1;i>=0;i--) {
		     System.out.print(org.charAt(i));
		     }
	}
}