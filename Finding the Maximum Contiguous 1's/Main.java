#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d", &arr_size);
  int arr[arr_size];
  for(int i = 0; i < arr_size; i++)
   scanf("%d", &arr[i]);
  int max_count = 0;
  for(int i = 0; i < arr_size; i++)
  {
    int count = 0;
    for(int j = 0; j < arr_size; j++)
    {
      if((arr[i] == 1) && arr[j] == 1 && i < j)
        count++;
    }
    if(count > max_count)
      max_count = count;
  }
  printf("%d", max_count);
  return 0;
}