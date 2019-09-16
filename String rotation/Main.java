
#include <stdio.h>
#include <string.h>
int rotation(char str[], char strc[], int len, int lenc)
{
    char temp = str[0];static int x = 0; 
    for(int index = 0; index < len; index++)
     {
        str[index] = str[index + 1]; 
     }
     str[len - 1] = temp;
     int z = strcmp(str, strc);
     if(z == 0)
      return 1;
     else if(x < len - 1)
      {
          x++;
         return rotation(str, strc, len, lenc);
      }
      else
       return 0;
      
}
int main()
{
 char str[100];
 scanf("%s", str);
 char strc[100];
 scanf("%s", strc);
 int len = strlen(str);
 int lenc = strlen(strc);
 int is_rotate = rotation(str, strc, len, lenc);
 if(is_rotate)
  printf("Yes");
 else
 printf("No");
    return 0;
}