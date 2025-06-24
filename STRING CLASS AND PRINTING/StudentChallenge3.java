public class StudentChallenge3 {
    public static void main(String[] args) {
 
        // REMOVE SPECIAL CHARACTERS FROM A STRING

        String str = " a!B@c#1#$2%3";

        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));


        // Remove extra spaces from a string

        String str2 = " abc  de  fgh  ijk";

    //    System.out.println(str2.replaceAll("\\s+ ", " ") .trim());

    // Find no of words in a String

    String words[] = str.split("\\s");

    System.out.println(words.length);






        
    }
    
}
