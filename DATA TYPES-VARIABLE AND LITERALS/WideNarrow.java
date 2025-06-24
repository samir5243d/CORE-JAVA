public class WideNarrow {
    public static void main(String[] args) {
        byte b=10;
        short s=10;
        int i=10;
        long l=10;
        float f=10;
        double d=10;
        char c=10;
        boolean bl=true;

       s=b;
        i=b;
        l=b;
        f=b;
        l=b;
        i=s;
        f=s;
        d=s;

        //  b=s; is not compatible so we need to do narrowing

        b=(byte)s;
        System.out.println(b); // this is called narrowing
        
        //i=f; is not compatible so we need to do narrowing
        i=(int)f;
        System.out.println(i);

       // f=d; is not compatible it is type casting and it leads to forcing and it effects as data loss
          f=(float)d;
          System.out.println(f);
    
        // for booolean typecasting is not posible


    }
    
}
