// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int num;
  scanf("%d", &num);
  int a[100];
  for(int i = 0; i < num; i++)
   scanf("%d", &a[i]);
  printf("%d", num - 1);
}