#include <stdio.h>
int main(){
	int n, c=0;
  scanf("%d", &n);
  for(int i = 1; i <= n; i++)
  {
    for(int j = 1; j <= i; j++)
    {
      c++;
      if(c % 2 == 0)
        printf("#");
      else
        printf("*");
    }
    printf("\n");
  }
  	return 0;
}