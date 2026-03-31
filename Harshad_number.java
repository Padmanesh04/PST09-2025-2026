package pst;

import java.util.Scanner;
public class Harshad_number {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
		   int num = sc.nextInt();
		   int temp=num;
		   int sum=0;
		   while(temp!=0) {
			   sum=temp%10;
			   sum+=sum;
			   temp/=10;
		   }
		   if(num%sum==0) {
			   System.out.println("its a harshad number");
		   }else {
			   System.out.println("its not a harshad number");
		   }
	}

}
