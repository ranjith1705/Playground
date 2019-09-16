import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      String str = in.nextLine();
      int arr[] = new int[26];
      for(int i = 0; i < 26; i++)
        arr[i] = 0;
      for(int i = 0; i < str.length(); i++)
      {
        int offset = str.charAt(i);
        if(offset >=  'a' && offset <= 'z')
        {
          offset = offset - 'a';
          arr[offset]++;
        }
        else if(offset >= 'A' && offset <='Z')
        {
          offset = offset - 'A';
          arr[offset]++;
        }
      }
      for(int i = 0; i < 26; i++)
      {
        if(arr[i] == 0)
        {
          char val = (char) (i + 'a');
          System.out.print(val+" ");
        }
      }
    }
}