package pst;

import java.util.Scanner;

public class Convertchartostr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a character :");
		 char s =sc.next().charAt(0); 
		 String nu = ""+s;
		 System.out.println(nu);
	}

}
