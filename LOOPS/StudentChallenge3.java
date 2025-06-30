
import java.util.Scanner;

public class StudentChallenge3 {

    // REVERSE of A NO

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Enter a no");

    //     int n=sc.nextInt();

    //     int rev =0,r;

    //     while (n>0) {
    //         r=n%10;
    //         rev=rev*10+r;;
    //         n=n/10;
            
            
    //     }
    //     System.out.println("Reverse of a no "+rev);


        
    // }


    // CHECK A NO IS PALINDROME OR NOT

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no");

        int n = sc.nextInt();
        int original = n; // Store the original number for comparison
        int rev = 0, r;

        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }

        if (original == rev) {
            System.out.println("The number is a palindrome: " + rev);
        } else {
            System.out.println("The number is not a palindrome. Reverse is: " + rev);
        }
    }


    
}
