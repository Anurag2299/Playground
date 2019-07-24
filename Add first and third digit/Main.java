#include<stdio.h>
int main()
{
  //Type your code here
  int n,m,s;
  scanf("%d",&s);
  n=s%10;
  m=s/100;
  printf("%d",n+m);
  return 0;
}