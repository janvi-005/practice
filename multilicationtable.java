package practice;
import java.util.*;
public class multilicationtable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();
        int i = 1;
        System.out.println("Multiplication Table of " + num + ":");
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10); 
    }
}
