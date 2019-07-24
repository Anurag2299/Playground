#include<stdio.h>
int main()
{
	//type your code here
  int a=1,i;
  char c[100];
  gets(c);
  for(i=0;i<strlen(c);i++)
  {
    if(strlen(c)>20)
    {
      printf("Invalid Input");
      break;
    }
    else if(c[i]==c[i+1])
        a++;
    else
    {
      printf("%c%d",c[i],a);
      a=1;
      
    }
  }
}