public class PracticingObjectPassing {

    static void change(int A[], int index, int value) {
        A[index] = value;
    }

    public static void main(String[] args) {

        int A[] = { 2, 4, 6, 8, 10 };

        change(A,2,20);// Passing the array and modifying its element at index 2

        for(int x:A){
            System.out.println(x);
        }

    }

}

