import java.util.Scanner;

public class StudentChallenge1A {

    // 1 //DISPLAY MULTIPLICATION TABLE

    // public static void main(String[] args) {

    // Scanner sc =new Scanner(System.in);

    // System.out.println("Enter a no");

    // int n=sc.nextInt();

    // for(int i=1; i<=10; i++){
    // System.out.println(n+"x"+i+"="+n*i);

    // }

    // }

    // // 2// FIND SUM OF NATURAL NUMBERS//

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.println("Enter a no");

    // int n= sc.nextInt();

    // int sum = 0;

    // for(int i=1; i<=n; i++){

    // sum=sum+i;

    // }
    // System.out.println("Sum of "+n+" Number is "+sum);

    // }


     //Factorial of a no//
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a no");

        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("factorial is " + factorial);

    }

}
