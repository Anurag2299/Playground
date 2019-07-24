#include <stdio.h>
int main() {
	//Type your code
  int a,b;
  int n;
  scanf("%d",&n);
  b=n%10;
  while(n>0)
  {
    a=n%10;
    n/=10;
  }
  printf("%d",a+b);
	return 0;
}