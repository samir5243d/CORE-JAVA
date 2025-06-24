import java.util.Scanner;

public class Type_OfWebsite {
    // display name of a day based on number

    // public static void main(String[] args) {
        
    //     Scanner sc = new Scanner(System.in);

    //     int day;

    //     System.out.println("Enter day no");

    //     day = sc.nextInt();

    //     if (day==1) {
    //         System.out.println("Monday");
            
    //     }else if (day==2) {
    //         System.out.println("Tuesday");
            
    //     }else if (day==3) {
            
    //         System.out.println("Wednesday");
    //     }else if (day==4) {
    //         System.out.println("Thursday");
            
    //     }
    //     else if (day==5) {
    //         System.out.println("Friday");

            
    //     }
    //     else if (day==6) {
    //         System.out.println("saturday");
            
    //     }
    //     else if (day==7) {
    //         System.out.println("sunday");
    //     }
    //     else{
    //         System.out.println("its not a day");
    //     }
        


    // }

    

    // finding type of website

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a url");
        String url=sc.nextLine();

        String protocol=url.substring(0, url.indexOf(":"));

        if (protocol.equals("http")) {
            System.out.println("Hypertext Transfer Protocol");
            
        }else if (protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        }
        

        String ext=url.substring(url.lastIndexOf("."));

        if (ext.equals("com")) {

            System.out.println("comercial");
            
        }else  if (ext.equals("gov")) {
            System.out.println("government");
        }
        else if (ext.equals("net")) {
            System.out.println("network");
            
        }
            
        }

    }
    

    



