#include <stdio.h>
int main() {
	//Type your code
  int n,a=0;
  int sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
    a=n%10;
    sum=sum+a;
    n/=10;
  }
  printf("%d",sum);
	return 0;
}