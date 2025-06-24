public class PracticingStringMethod3 {
    public static void main(String[] args) {
        String str1 = "Pyramid";

        // String str2 = "Pyramid";

        String str2 = new String("Pyramid");

        System.out.println(str1.equals(str2)); // compares two strings for equality

        // System.out.println(str1.equalsIgnoreCase(str2)); // compares two strings
        // ignoring case sensitivity

        // System.out.println(str1 == str2);// compares the references of two strings

        System.out.println(str1.compareTo(str2)); // compares two strings lexicographically


        //String str1="pyramid";
        
        // String str1="china wall";
        // String str2=new String("china tall");
        
        //System.out.println(str1.equals(str2));
        // System.out.println(str1.compareTo(str2));
        
        
        
        // String str1="the great wall ";
        // String str2="of china";
        // System.out.println(str1.contains("wall")); // checks if str1 contains the substring "wall"
        // System.out.println(str1.concat(str2));//System.out.println(str1 + str2);// concatenates two strings
        

    }

}
