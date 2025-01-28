import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the first variable (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second variable (b): ");
        int b = scanner.nextInt();
        
       
        
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
       
        int temp = a;
        a = b;
        b = temp;
        
       
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        scanner.close();
    }
}