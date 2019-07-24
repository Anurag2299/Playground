#include <stdio.h>
#include<math.h>
int main()
{
  	//Your code here  
  int b,e,x;
  scanf("%d%d",&b,&e);
  if(e<0)
    printf("Wrong input");
  else
  {
    x=pow(b,e);
    printf("%d",x);
  }
    return 0;
}