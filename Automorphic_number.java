package pst;
import java.util.Scanner;
public class Automorphic_number {
	 public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number :");
	   int num = sc.nextInt();
	   int square=num*num;
	   int temp=num;
	     while (temp!=0){
		   int digit=temp%10;
		   int target=square%10; 
		    if(digit!=target) {
		    	System.out.println("not a automorphic");
		    	return;
		   }
		    temp/=10;
		    square/=10;
	   }
       System.out.println("Automorphic");
	}

}
