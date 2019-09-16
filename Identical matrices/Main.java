#include<stdio.h>
int main()
{
	int r,c;
    scanf("%d%d", &r, &c);
    int a[r][c], b[r][c];
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
      scanf("%d", &a[i][j]);
  }
  for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
      scanf("%d", &b[i][j]);
  }
  int flag = 0;
   for(int i = 0; i < r; i++)
  {
    for(int j = 0; j < c; j++)
    {
      if(a[i][j] != b[i][j])
      {
        flag = 1;
        break;
      }
    }
   }
  if(flag == 1)
    printf("No");
  else
    printf("Yes");
	return 0;
}