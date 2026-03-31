package pst;
import java.util.Scanner;
public class Largestelement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int a = sc.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter the " + a + " values:");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();   
        int larg = arr[0]; 
        for (int j = 1; j < a; j++) {
            if (arr[j] > larg) {
                larg = arr[j];
            }
        }
        System.out.println("Largest element is: " + larg);
    }
}
   
}
