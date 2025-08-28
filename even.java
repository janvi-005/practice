package practice;
public class even {
    public static void main(String[] args) {
        int i = 1; 

        System.out.println("Even numbers from 1 to 50:");

        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++; 
        }
    }
}
