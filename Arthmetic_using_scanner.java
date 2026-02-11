import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number1: "); 
        int num1 = sc.nextInt();
        System.out.print("Enter the number2: "); 
        int num2 = sc.nextInt();
        int add=num1+num2;
        int sub=num1-num2;
        int quo=num1/num2;
        int rem=num1%num2;
        System.out.println("add="+add);
        System.out.println("sub="+sub);
        System.out.println("quo="+quo);
        System.out.println("rem"+rem);
	}
}
