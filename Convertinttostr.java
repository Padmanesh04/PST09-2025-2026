package pst;

import java.util.Scanner;
public class Convertinttostr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a number :");
		 int n =sc.nextInt();
		 int sci=n;
		 String con="";
		 int dig;
		 while(sci!=0) {
			 dig=sci%10;
			 con =dig+con;
			 sci/=10;
		 }
		 System.out.println(con);
	}

}
