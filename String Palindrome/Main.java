
import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    int front = 0;
    int last = str.length() - 1;
    boolean flag = true;
    while(front<last)
    {
      if(str.charAt(front) != str.charAt(last))
         {
           flag = false;
           break;
         }
         front++;
         last--;
     }
     if(flag)
         System.out.print("Yes");
     else
         System.out.print("No");
  }
}

