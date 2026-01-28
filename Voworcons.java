package pst;

import java.util.Scanner;
public class Voworcons {
 public static void main(String[]arg) {
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter a character: ");
     char ch = sc.next().charAt(0);
     if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
         System.out.println(ch + " is a vowel.");
     } else  {
         System.out.println(ch + " is a consonant.");
     }
 }
}