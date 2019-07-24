#include<stdio.h>
int main()
{
  //Type your code here
  long a,temp,sum=0,i=0;
  scanf("%ld",&a);
  while(a>0)
  {
    if(a%10!=0)
    {
      temp=pow(2,i);
      sum+=temp;
    }
    i++;
    a/=10;
  }
  printf("%d",sum);
  return 0;
}