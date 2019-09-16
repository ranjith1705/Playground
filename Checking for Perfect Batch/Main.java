import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++)
      list[i] = in.nextInt();
    int u = sum_of_digits(list, 0, 2);
    int v = sum_of_digits(list, 3, 5);
    if(u == v)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
  public static int sum_of_digits(int list[], int start, int end)
  {
    int sum = 0;
    for(int i = start; i <= end; i++)
    {
      sum = sum + list[i];
    }
    return sum;
  }
      
}