#include <stdio.h>
int main() {
	//Type your code
  int n,c,i,a;
  int sum=0,t=1;
  scanf("%d",&n);
  c=n;
  while(n>0)
  {
    t=1;
    a=n%10;
    for(i=a;i>0;i--)
      {
        t=t*i;
      }
    sum=sum+t;
    n/=10;
  }
  if(sum==c)
    printf("Yes");
  else
    printf("No");
	return 0;
}