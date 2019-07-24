#include<stdio.h>
int main()
{
   int n,m;
  scanf("%d",&n);
  m=n%10;
  n=n/10;
  printf("%d",n+m);
  return 0;
}