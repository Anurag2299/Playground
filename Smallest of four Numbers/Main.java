#include<stdio.h>

int main()
{
  // Type your code here
  int a[4],min=10000;
  int i;
  for(i=0;i<4;i++)
  {
    scanf("%d",&a[i]);
    if(a[i]<min)
      min=a[i];
  }
  printf("%d",min);
}