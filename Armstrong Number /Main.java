#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int j,x=1,k,n,a[10],i=0,sum=0,c;
  scanf("%d",&n);
  c=n;
  while(n>0)
  {
    a[i]=n%10;
    n/=10;
    i++;
  }
  for(j=0;j<i;j++)
  {
    for(k=0;k<i;k++)
    {
      x=x*a[j];
    }
    sum+=x;
    x=1;
  }
  if(sum==c)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
	return 0;
}