#include <stdio.h>
#include <math.h>
int main() {
	int num, l, last;
  scanf("%d", &num);
  l = log10(num)+1;
  last = num % 10;
  num = num / (pow(10,l-1));
  printf("%d", last + num);
	return 0;
}