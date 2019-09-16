import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      String strg = in.nextLine();
      String temp = str.concat(str);
      if(temp.indexOf(strg)!=-1)
        System.out.print("Yes");
      else
        System.out.print("No");
    }
}