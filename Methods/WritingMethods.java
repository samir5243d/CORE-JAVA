// Example : Finding Maximum of Two no'S

public class WritingMethods {

    // max method

    static int max(int x, int y) // formal parameters
    {
        if (x > y)
            return x;
        else
            return y;

    }

    public static void main(String[] args) {
        int a = 10, b = 15;

        System.out.println(max(a, b));

    }
}