import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for(int i = 0; i < arr_size; i++)
    {
      arr[i] = in.nextInt();
    }
    int ele1 = in.nextInt();
    int ele2 = in.nextInt();
    boolean flag = true;
    boolean flg  = true;
    for(int i = 0; i < arr_size; i++)
    {
      if(arr[i] == ele1)
      {
        flag = false;
        System.out.println(i);
      }
       if(arr[i] == ele2)
      {
        flg = false;
        System.out.println(i);
      }
    }
    if(flag)
      System.out.println("-1");
    if(flg)
      System.out.println("-1");
  }
}
      
      
        