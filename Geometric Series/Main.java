#include<stdio.h>
#include<math.h>
int main()
{
  //type your code here
  int a,f,n;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=n/2;
    f=1*pow(2,a);
    printf("%d",f);
  }
  else
  {
     a=n/2-1;
    f=1*pow(3,a);
    printf("%d",f);
  }
  return 0;
}