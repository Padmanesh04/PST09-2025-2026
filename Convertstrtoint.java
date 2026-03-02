package pst;

import java.util.Scanner;

public class Convertstrtoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a string :");
		 String s =sc.next(); 
	     int num = 0;
            for (int i = 0; i < s.length(); i++) {
			   char ch = s.charAt(i);
			     num = num * 10 + (ch - '0');
			        }
               System.out.println("Int:" + num);
			    }
			}

		

