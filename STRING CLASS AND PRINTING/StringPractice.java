import java.nio.channels.Pipe.SourceChannel;

public class StringPractice {
    public static void main(String[] args) {

        // String str1 = "Java Progrm";

        // String str2 = new String("JAVA");

        // char c[] = { 'h', 'e', 'l', 'l', 'o' };

        // String str3 = new String(c, 1, 3);

        // byte b[] = { 65, 66, 67, 68 };

        // String str4 = new String(b, 1, 2);

        // System.out.println(str1);
        // System.out.println(str2);
        // System.out.println(str3);
        // System.out.println(str4);

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1 == str2); // true, because both refer to the same string literal in the string pool;
        System.out.println(str1 == str3); // false, because str3 is a new String object created in heap memory;

    }

}
