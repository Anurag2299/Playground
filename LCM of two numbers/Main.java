#include<stdio.h>
int main()
{
  //Type your code here
  int a,i,b,c;
  scanf("%d %d",&a,&b);
  c=a>b?a:b;
  for(i=c;i<=a*b;i++)
  {
    if(i%a==0 && i%b==0)
    {
      printf("%d",i);
      break;
    }
  }
  return 0;
}