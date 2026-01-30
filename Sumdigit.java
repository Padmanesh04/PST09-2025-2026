package pst;

import java.util.Scanner;

public class Sumdigit {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number :");
	 int num =sc.nextInt();
	  int sum=0;
	 while(num!=0) {
	 int temp = num % 10;
	 sum +=temp;
	 //System.out.println(""+ sum);
	 num = num / 10;
	 }
	 System.out.println(sum);
	}
}
