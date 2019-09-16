#include<stdio.h>
int main()
{
  int size;
  scanf("%d", &size);
  int arr[100];
  for(int i = 0; i < size; i++)
    scanf("%d", &arr[i]);
  for(int i = 1; i <= size; i++)
  { 
    int found = 0;
    for(int index = 0; index < size; index++)
    {
      if(i == arr[index])
      {
        found = 1;
        break;
      }
    }
    if(found == 0)
      printf("%d", i);
  }
  return 0;
}