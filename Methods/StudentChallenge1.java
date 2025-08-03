


public class StudentChallenge1 {

    static boolean isPrime (int n)
    {
       for(int i=2; i<n/2; i++) 
       {
         if (n%i==0) {
            return false; // If n is divisible by any number other than 1 and itself, it's not prime
         }
         return true;
       }
    }
    public static void main(String[] args) {
        System.out.println(isPrime(19)); // Should return true
    }
    
}
