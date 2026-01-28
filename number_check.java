import java.util.Scanner;
public class number_check
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
		System.out.print("enter the number:");
		int num=sc.nextInt();
		if(num==0){
		    System.out.println("your number is zero:" + num);
		}
		else if(num>=0){
		    System.out.println("your number is positive:" + num);
		}
		else{
		    System.out.println("your number is negative:" + num);
		}
	}
}
