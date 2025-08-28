
package practice;
import java.util.*;

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        long fact = 1;  

        while (i <= num) {
            fact *= i;
            i++;       
        }

        System.out.println("Factorial of " + num + " = " + fact);
    }
}
