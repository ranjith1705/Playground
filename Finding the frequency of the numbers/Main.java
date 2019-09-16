#include<stdio.h>
int main()
{
  int n, k;
  scanf("%d%d", &n, &k);
  int arr[n];
  for(int i = 0; i < n; i++)
   scanf("%d", &arr[i]);
  for(int i = 1; i <= k; i++)
  {
    int freq = 0;
    for(int j = 0; j < n; j++)
    {
      if(i == arr[j])
        freq++;
    }
   printf("%d %d\n", i, freq);
  }
  return 0;
}