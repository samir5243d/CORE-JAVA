import java.util.Scanner;

public class Radix {

    // finding Radix
    // public static void main(String[] args) {
    // Scanner sc= new Scanner(System.in);

    // String num;

    // System.out.println("Enter a Number");
    // num= sc.nextLine();

    // if (num.matches("[01]")) {
    // System.out.println("Binar Radix = 2");

    // }else if (num.matches("[0-7]+")) {
    // System.out.println("Octal Radix=8");

    // }else if (num.matches("[0-9]+")) {
    // System.out.println("Decimal Radix=10");

    // }
    // else if (num.matches("[0-9A-F]+")) {

    // }
    // else{
    // System.out.println("not a no");

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.println("Enter Year No");

        year = sc.nextInt();

       if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("its an leap year");
                } else
                    System.out.println("its not a leap year");

            } else {
                System.out.println("its an leap year");
            }

        } else {
            System.out.println("Not a leap year");
        }
    }

}
