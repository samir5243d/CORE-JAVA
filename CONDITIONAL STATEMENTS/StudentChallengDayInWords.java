import java.util.Scanner;

public class StudentChallengDayInWords {

    //day in word
    

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("enter day no");

    //     int day = sc.nextInt();

    //     switch (day) {
    //         case 1:
    //             System.out.println("monday");

    //             break;

    //         case 2:
    //             System.out.println("tuesday");
    //             break;

    //         case 3:
    //             System.out.println("wednesday");

    //             break;

    //         case 4:
    //             System.out.println("thursday");
    //             break;

    //         case 5:
    //             System.out.println("friday");
    //             break;

    //         case 6:
    //             System.out.println("saturday");
    //             break;

    //         case 7:
    //             System.out.println("sunday");
    //             break;

    //         default:System.out.println("invalid");
    //             break;
    //     }

    //}

  // Display Type of website

  public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter Domain Name");
    String domain= sc.nextLine();

    String ext= domain.substring(domain.lastIndexOf(".")+1);

    switch (ext) {
        case "com":System.out.println("comercial");
            
            break;

            case "net": System.out.println("network");
            break;

            case "org": System.out.println("organisation");
            break;

            case "gov":System.out.println("government");
    
        default:System.out.println("invalid");
            break;
    }




}



}
