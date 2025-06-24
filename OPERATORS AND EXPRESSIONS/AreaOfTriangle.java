import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
      //  float base, height, area;
      //  System.out.println(" enter Base and Height  ");
       // Scanner sc=new Scanner(System.in);
       // base=sc.nextFloat();
       // height= sc.nextFloat();

       // area = base*height/2;

       // System.out.println("area of triangle is " +area);

      int a,b,c;
      float s;
      double area;

      System.out.println(" enter 3 sides of a triangle ");
      Scanner sc =new Scanner (System.in);
       a = sc.nextInt();
       b= sc.nextInt();
       c= sc.nextInt();

       s= (a+b+c)/2f;

       area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.println("area is "+area);


        
    }
    
    
}
