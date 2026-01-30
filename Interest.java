package pst;
import java.util.Scanner;
public class Interest {
 public static void main(String[]args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value of p:");
	 int p =sc.nextInt();
	 System.out.println("Enter the value of r:");
	 int r =sc.nextInt();
	 System.out.println("Enter the value of t:");
	 int t =sc.nextInt();
	double s = (p*r*t)/ 100. ;
	System.out.println(" The simple interest are " + s);
 }
}
