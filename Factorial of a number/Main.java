#include <stdio.h>
int main() {
	//Type your code
  int n,i,t=1;
  scanf("%d",&n);
  for(i=n;i>0;i--)
  {
    t=t*i;
  }
  printf("%d",t);
	return 0;
}