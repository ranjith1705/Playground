import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String st = in.nextLine();
      String at = st.toLowerCase();
      StringBuilder str = new StringBuilder(at);
      int count = 1;
      for(int i = 0; i < str.length(); i++)
      {
        count = 1;
        for(int j = i + 1; j < str.length(); j++)
        {
          if(str.charAt(i) == str.charAt(j))
          {
             count++;
             str.setCharAt(j, '$');
          }
        }
        char ch =  (str.charAt(i));
        if(ch != '$')
        {
        System.out.print(ch);
        System.out.print(count+" ");
        }
      }
    }
}