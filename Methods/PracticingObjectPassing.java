public class PracticingObjectPassing {

    static void change(int A[], int index, int value) {
        A[index] = value;
    }

    static void change2(int x, int value){
        x= value; // This will not change the original value of x in main

    }

    public static void main(String[] args) {

        int A[] = { 2, 4, 6, 8, 10 };

        change(A,2,20);// Passing the array and modifying its element at index 2

        for(int x:A){
            System.out.println(x);
        }

        // int x=10;
        // change2(x,20);
        // System.out.println("Value of x after change2: " + x); // This will still print 10

    }

}

