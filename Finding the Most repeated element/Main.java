#include<stdio.h>
int main()
{
 int arr_size;
  scanf("%d", &arr_size);
  int arr[arr_size];
  for(int i = 0; i < arr_size; i++)
   scanf("%d", &arr[i]);
  int max_count_index = 0, max_count = 1;
  for(int i = 0; i < arr_size; i++)
  {
    int count = 1;
    for(int j = 0; j < arr_size; j++)
    {
      if((i < j) && (arr[i] == arr[j]))
        count++;
    }
    if(max_count < count)
      max_count_index = i;
  }
  printf("%d", arr[max_count_index]);
  return 0;
}