public class Practicing2darray {

    public static void main(String[] args) {

        // int A[] []=new int[5][5];

        // int B[] []={{1,2,3}, {2,4,6,}, {1,3,5}};

        // int C[] [];
        // C=new int[5][5];

        // int []D[] =new int[5][5];

        // int[] E,F[];

        // int [] G,H,I,J;

        // E=new int[5] ;
        // F=new int [5][5];

        /*DISPLAYING ELEMENTS OF  TWO DIMENTIONAL ARRAY */

        // for(int i=0; i<B.length; i++) //BY USING FOR LOOP
        // {
        //     for(int j=0; j<B[0].length; j++)
        //     {
        //         System.out.print(B[i] [j] +" ");
        //     }
        //     System.out.println("");
        // }


        //NOW BY USING FOR EACH LOOP

        // for(int x[]:B)
        // {
        //     for(int y:x)
        //     {
        //         System.out.println(y);
        //     }
        // }


        // NOW JAGGED ARRAY BY USING FOR LOOP

        // int A[][];
        // A= new int [3] [];

        // A[0]=new int[5];
        // A[1]=new int[3];
        // A[2]=new int[8];

        // for(int i=0;i<A.length; i++)
        // {
        //     for(int j=0; j<A[i].length; j++)
        //     {
        //         System.out.print(A[i][j]+" ");
        //     }
        //     System.out.println("");
        // }


        // NOW JAGGED ARRAY BY USING FOR EACH LOOP

   

 int A[][];
        A= new int [3] [];

        A[0]=new int[5];
        A[1]=new int[3];
        A[2]=new int[8];

        for(int x[]:A)
        {
            for(int y:x)
            {
                System.out.print(y+" ");
            }
            System.out.println("");
        }




        
    }
    
}
