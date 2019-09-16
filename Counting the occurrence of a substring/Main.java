import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    String str = in.nextLine();
    String sub = in.nextLine();
    int count = 0;
    boolean flag = false;
    for(int i = 0; i <= str.length() - sub.length(); i++)
    {
      for(int j = 0; j < sub.length(); j++)
      {
        if(str.charAt(i + j) == sub.charAt(j))
          flag = true;
        else
        {
          flag = false;
          break;
        }
      }
      if(flag)
        count++;
    }
    System.out.print(count);
  }
}
