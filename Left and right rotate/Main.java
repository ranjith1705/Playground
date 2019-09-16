// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
void rotated(int a[], int size, int rotation)
{
  int temp1, temp2, rotate, index, k, l;
  if(size % 2 == 0)
  {
      k = size -1;
      l = size -2;
  }
    else
    {
      k = size - 2;
      l = size - 1;
    }
    
  for(rotate = 0; rotate < rotation; rotate++)
  {
    temp1 = a[1];
    for(index = 1; index < size; index = index + 2)
    {
      a[index] = a[index + 2];
    }
    a[k] = temp1;
    //odd
      temp2 = a[l];
    for(index = l; index >= 0; index = index - 2)
    {
      a[index] = a[index - 2];
    }
    a[0] = temp2;
  }
}
int main()
{
  int size;
  scanf("%d", &size);
  int arr[size];
  for(int index = 0; index < size; index++)
    scanf("%d", &arr[index]);
  int rotation;
  scanf("%d", &rotation);
  rotated(arr, size, rotation);
  for(int i = 0; i < size; i++)
    printf("%d ", arr[i]);
   return 0;
}