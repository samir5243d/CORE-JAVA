public class StudentChallenge1 {

    public static void main(String[] args) {

        //  FIND IF THE EMAIL ID IS ON GMAIL
        // FIND USERNAME AND DOMAIN NAME FORM EMAIL
        
        String str = "programmer@gmail.com";

        int i=str.indexOf("@");
        String uname=str.substring(0,i);
        String domain =str.substring (i+1, str.length ());

        System.out.println("Username: " + uname);
        System.out.println("Domain: " + domain);

        System.out.println(domain.startsWith("gmail.com"));
    }

}
