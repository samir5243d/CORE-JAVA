import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("enter 2 numbers");

        int x=sc.nextInt();
        int y= sc.nextInt();

        sc.nextLine();

        System.out.println("enter option in words");

        String option=sc.nextLine();
        // option=option.toUpperCase();


        switch (option) {
            case "ADD":System.out.println("sum is "+ (x+y));
            break;

            case "SUB":System.out.println("SUB is "+ (x-y));
            break;

            case "MUL":System.out.println("MUL is "+ (x*y));
            break;


            case "DIV":System.out.println("DIV is "+ (x/y));
            break;         
        
            default:System.out.println("INVALID OPTION");
                break;
        }
    }
    
}
