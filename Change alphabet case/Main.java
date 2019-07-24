#include <stdio.h>
int main() {
	// Type your code here
  char a;
  int d;
  scanf("%c",&a);
  if(a>96)
  {
    d=a-32;
    printf("%c",d);
  }
  else
   {
    d=a+32;
    printf("%c",d);
  }
	return 0;
}