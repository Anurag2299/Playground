#include<stdio.h>
int main()
{
  //Type your code here
  long a,c[100],i=0,d;
  scanf("%ld",&a);
  while(a>0)
  {
    c[i]=a%8;
    a/=8;
    i++;
    d=i;
  }
  for(i=d-1;i>=0;i--)
  printf("%d",c[i]);
  return 0;
}