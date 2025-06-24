
import java.util.Scanner;

public class StudentChallenge3 {

    // Finding no is even or odd
    // public static void main(String[] args) {
    // int n;

    // Scanner sc =new Scanner(System.in);

    // System.out.println("Enter a no");

    // n=sc.nextInt();

    // if(n%2==0){
    // System.out.println("the no is even");

    // }
    // else{
    // System.out.println("the no is odd");
    // }

    // }

    // For finding age of a person is young or not
    // public static void main(String[] args) {

    // int age;

    // Scanner sc = new Scanner(System.in);

    // System.out.println("enter age of a person");

    // age=sc.nextInt();

    // if (age>=14 && age<=55) {
    // System.out.println("the person is young");

    // }
    // else{
    // System.out.println("the person is not young");
    // }

    // }

    // For finding grades

    public static void main(String[] args) {

        int m1, m2, m3;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter marks of three subjects");

        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();

        float avg = (float) (m1 + m2 + m3 / 3);

        if (avg >= 70) {
            System.out.println("GRADE A");

        } else if (avg >= 60 && avg <= 70) {
            System.out.println("GRADE B");

        } else if (avg >= 50 && avg <= 60) {
            System.out.println("GRADE C");

        } else if (avg >= 40 && avg <= 50) {
            System.out.println("GRADE D");

        } else {
            System.out.println("FAIL");
        }

    }

}
