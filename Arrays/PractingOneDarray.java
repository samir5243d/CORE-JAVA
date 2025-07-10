public class PractingOneDarray {
    public static void main(String[] args) {
        int A[]=new int[10];// Declaration and initialization of an array with size 10 

        int B[]={1,2,3,4,5};// Declaration and initialization of an array with values

        int C[];
        C=new int[10];// Declaration of an array and then initialization with size 10

        B[2]=15;



        for(int i=0;i<B.length;i++){
            
            System.out.println(B[i]++);
        }

        for(int x:B){
            System.out.println(x);
        }

        // for(int x:B){
        //     System.out.println(x++);
        // }

        


        
    }
}
    
    

