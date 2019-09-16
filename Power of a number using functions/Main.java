import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    int val = 1;
    for(int i = 1; i <= exponent; i++)
    {
     val =  val * base;
    }
    System.out.println(val);
  }
}