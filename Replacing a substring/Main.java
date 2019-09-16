import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String replace = in.nextLine();
      String include = in.nextLine();
      String strg = str.replace(replace, include);
      System.out.println(strg);
    }
}