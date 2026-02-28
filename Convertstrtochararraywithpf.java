package pst;

import java.util.Scanner;

public class Convertstrtochararraywithpf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a String :");
		 String s =sc.next();
		 char[] arr=s.toCharArray();
        System.out.println(arr);
	}

}
