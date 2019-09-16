#include <stdio.h>
int main() 
{
 int num;
  scanf("%d", &num);
  for(int i = 1 ; i <= num; i++)
  {
    printf("%d", i);
    if( i % 3 == 0)
      printf(",");
  }
	return 0;
}