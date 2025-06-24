public class FormatedOutputOne {
  public static void main(String[] args) {

    int x = 10;
    // float y= 12.56f;
    float y = 0.0012f;
    char z = 'A';
    String str = "java program";

    // System.out.printf("Integer: %d, Float: %.2f, Char: %c, String: %s\n", x, y,
    // z, str);
    // System.out.printf("hello %d %f %c world \n", x,y,z);

    // System.out.printf("hello %e \n" ,y);
    // System.out.printf("hello %s \n, str");

    System.out.printf("%1$d %2$f %1$d", x,y);
  }

}
