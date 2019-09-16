#include <stdio.h>
#include <math.h>
int main() 
{
int n, l, flag, sum = 0,a;
  scanf("%d", &n);
  l = log10(n)+1;
  a = n;
  while(n)
  {
    flag = n % 10;
    sum = sum + pow(flag,l);
    n = n/ 10;
  }
  if(sum == a)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");

	return 0;
}