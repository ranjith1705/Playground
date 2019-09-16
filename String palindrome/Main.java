#include<stdio.h>
#include<string.h>
int main()
{
  char str[20], strrev[20];
  scanf("%s", str);
  int j = 0;
  for(int i = strlen(str) - 1; i >= 0; i--)
  {
    strrev[j++] = str[i];
  }
  if(strcmp(str, strrev) == 0)
    printf("%s is a palindrome", str);
  else
     printf("%s is not a palindrome", str);
  return 0;
}