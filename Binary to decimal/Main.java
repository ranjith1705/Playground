#include<stdio.h>
int main()
{
  long int number;
  scanf("%ld",&number);
  printf("%d",bin(number));//Type your code here
  return 0;
}
int bin(long int number)
{
  int decimal=0,reminder,i=0;
  while(number!=0)
  {
    reminder=number%2;
    number=number/10;
    decimal+=reminder*(pow(2,i));
    ++i;
  }
  return decimal;
}