#include <stdio.h>
int main() {
	int n, l, str=1, a, sum = 0;
  scanf("%d", &n);
  a = n;
  while(n)
  {
    l = n % 10;
    str = 1;
    for(int i = 1; i <= l; i++)
    {
      str = str * i;
    }
    sum = sum + str;
    n = n / 10;
  }
  if(sum == a)
    printf("Yes");
  else
    printf("No");
	return 0;
}