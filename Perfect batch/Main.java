/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int num, sum1 = 0, sum2 = 0;
  scanf("%d", &num);
  int a[100];
  for(int i = 0; i < num; i++)
    scanf("%d", &a[i]);
   for(int i = 0; i < num; i++)
   {
     if(i <num / 2)
       sum1 = sum1 + a[i];
     else
       sum2 = sum2 + a[i];
   }
  if(sum1 == sum2)
    printf("Perfect Batch");
  else
    printf("Not a Perfect Batch");
  return 0;
}