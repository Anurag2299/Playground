#include<stdio.h>
void main()
{
  int n,sum=0;
  scanf("%d",&n);
  do{
    sum=0;
  while(n>0)
  {
    sum+=n%10;
    n/=10;
  }
    n=sum;
  }while(sum>=10);
  printf("%d",sum);
}