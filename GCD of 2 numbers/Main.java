// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int small,n1,n2,i,gcd;
  scanf("%d\n %d",&n1,&n2);
  small=(n1<n2)?n1:n2 ;
  for(i=small;i>=-1;i--)
  {
    if(n1%i==0 && n2%i==0)
    {
      printf("%d",i);// Enter your code here 
        break;
    }
  }
 
   return 0;
}