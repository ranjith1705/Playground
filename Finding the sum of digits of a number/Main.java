#include <stdio.h>
int main() 
{
  int num;
  scanf("%d", &num);
  int count = 0;
  while(num)
  {
    count += num % 10;
    num /= 10;
  }
  printf("%d", count);
	return 0;
}