#include<stdio.h>
int main()
{
  int arr_size;
  scanf("%d", &arr_size);
  int arr[arr_size];
  for(int i = 0; i < arr_size; i++)
    scanf("%d", &arr[i]);
 
  for(int i = 0; i < arr_size / 2; i++)
  {
   for(int j = 0; j < arr_size / 2 - 1 - i; j++)
   {
     if(arr[j + 1] < arr[j])
     {
       int temp = arr[j + 1];
       arr[j + 1] = arr[j];
       arr[j] = temp;
     }
  }
  }
  for(int i = 0; i < arr_size; i++)
    printf("%d ", arr[i]);
	return 0;
}