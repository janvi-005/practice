package practice;
import java.util.*;

public class sumofpositivenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int sum = 0;

        System.out.println("Enter numbers (enter a negative number to stop):");

        while (true) {
            number = sc.nextInt(); 

            if (number < 0) { 
                break;
            }

            sum += number; 
        }

        System.out.println("Sum of positive numbers: " + sum);

      
    }
}
