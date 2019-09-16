#include<stdio.h>
void bubble_sort(int arr[], int arr_size, int start)
{
  for(int i = start; i <= arr_size; i++)
  {
    for(int j = start; j <= arr_size -1; j++)
    {
      if(arr[j] > arr[j + 1])
      {
        int temp;
        temp   = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
}
int main()
{
  int arr_size;
  scanf("%d", &arr_size);
  int arr[arr_size];
  for(int i = 0; i < arr_size; i++)
    scanf("%d", &arr[i]);
  int first = (arr_size -1) / 2;
  int first_half = (arr_size % 2 == 1) ? first - 1 : first;
  int second_half = arr_size - 1;
  bubble_sort(arr, first_half, 0);
  bubble_sort(arr, second_half, first_half + 1);
   for(int i = 0; i <= first_half; i++)
    printf("%d ", arr[i]);
  for(int i = second_half; i > first_half; i--)
    printf("%d ", arr[i]);
	return 0;
}