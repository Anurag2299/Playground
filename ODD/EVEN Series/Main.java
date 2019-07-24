#include<stdio.h>
int main()
{
	//type your code here
  int n,a=0;
  scanf("%d",&n);
  if(n%2==0)
  {
     a=n/2;
    printf("%d",a-1);
  }
  else
  {
    a=n-1;
    printf("%d",a);
  }
}