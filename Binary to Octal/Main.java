#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  long b,o[10],d=0,i=0;
  int temp,j;
  scanf("%ld",&b);
  while(b>0)
  {
    temp=b%10;
    if(temp==1)
      d+=pow(2,i);
     b/=10;
    i++;
  }
  i=0;
  while(d>0)
  {
    o[i]=d%8;
    d/=8;
    i++;
  }
  for(j=i-1;j>=0;j--)
    printf("%ld",o[j]);
}