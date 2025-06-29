
import java.util.Scanner;

public class StudentChallenge2 {
    // public static void main(String[] args) {

    // // TASK 1- DISPLAY DIGITS OF NO

    // Scanner sc = new Scanner(System.in);

    // System.out.println("enter no");
    // int n = sc.nextInt();

    // int r;// variable to store the last digit

    // while (n > 0) {
    // r = n % 10; // get the last digit
    // n = n / 10; // remove the last digit
    // System.out.println(r);

    // }
    // System.out.println(n);



    // // COUNT DIGITS OF A NO

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //      System.out.println("Enter a NO");
    //     int n= sc.nextInt();

    //     int count =0;
    //     while (n>0) {

    //         n=n/10;

    //         count++;
            
    //     }
    //     System.out.println(count);
    // }


    // FINDING A NO IS ARMSTRONG OR NOT

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a no");

        int n= sc.nextInt();

        int m=n;
        int sum=0;
        int r;
        while (n>0) {

            r=n%10;
            r=n/10;
            sum=sum+r*r*r;

            
        }
        if (sum==m) 
            System.out.println("Its a Armstrong no");

        else
           System.out.println("Its not a Armstrong No");    
            
        }
    }






   



