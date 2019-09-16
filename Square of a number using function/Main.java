#include<stdio.h>
int sum(int n)
{
  n = n * n;
  return n;
}
int main() 
{
int n;
  scanf("%d", &n);
  n = sum(n);
  printf("%d", n);
   return 0;
}