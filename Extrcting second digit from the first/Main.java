#include <stdio.h>
#include <math.h>
int main()
{
	int num, l;
  scanf("%d", &num);
  l = log10(num)+1;
  num = num / (pow(10,l-2));
   num %= 10;
               printf("%d", num);
	return 0;
}