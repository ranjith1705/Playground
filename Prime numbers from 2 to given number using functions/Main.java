import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int i = 2; i <= num; i++)
      {
        int flag = 1;
        for(int j = 2; j < i; j++)
        {
          if(i % j == 0)
          {
            flag = 0;
            break;
          }
        }
        if(flag == 1)
          System.out.println(i);
      }
	}
}