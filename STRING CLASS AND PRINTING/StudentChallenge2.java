public class StudentChallenge2 {
    public static void main(String[] args) {

        // FIND IF THE NUMBER IS A BINARY NUMBER
        // A BINARY NUMBER CONTAINS ONLY 0s AND 1s

        // int b = 10110001;
        // String str= Integer.toString(b);

        // System.out.println(str.matches("[01]*"));

        // // FIND IF THE NUMBER IS A HEXADECIMAL NUMBER

        // String str = "234AB";

        // System.out.println(str.matches("[0-9A-F]+"));

        String d = "03/12/2000";
        // FIND IF THE DATE IS IN THE FORMAT DD/MM/YYYY

        System.out.println(d.matches("[0-3][0-9]/[0-1][0-9]/[0-9]{4}"));

    }
}