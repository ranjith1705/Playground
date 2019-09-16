#include<stdio.h>
#include<string.h>
int main()
{
  char str1[100], str2[100];
  gets(str1);
  gets(str2);
  int len1 = strlen(str1);
  int len2 = strlen(str2);
  for(int index = 0; index < len1; index++)
  {
    if(str1[index] >= 'a' && str1[index] <= 'z')
      str1[index] = str1[index] - 32;
    if(str2[index] >= 'a' && str2[index] <= 'z')
      str2[index] = str2[index] - 32;
  }
  int index, j, count, no_of_occurance = 0;
  for(index = 0; index < len1 - len2 + 1; index++)
  {
    count = 0;
    for(j = 0; j < len2; j++)
        {
          if(str1[index + j] == str2[j])
          {
            count++;
            if(count == len2)
            {
              no_of_occurance++;
              break;
            }
          }
         }
    }
  printf("%d", no_of_occurance);
  return 0;
}