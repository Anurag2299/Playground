#include <stdio.h>
int main() {
	//Type your code
  int n,i=0;
  scanf("%d",&n);
  while(n>0)
  {
    if(i%2==1)
    {
      printf("%d\n",i);
        n--;
    }
    i++;
  }
	return 0;
}