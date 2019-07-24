#include <stdio.h>
int main() {
	//Type your code
  int n,c;
  scanf("%d",&n);
  while(n>10)
  {
    c=n%10;
    n/=10;
  }
  printf("%d",c);
	return 0;
}