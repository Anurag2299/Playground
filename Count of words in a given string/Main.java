#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  int i,s=0;
  char c[100];
  gets(c);
  for(i=0;i<strlen(c);i++)
  {
    if(c[i]==' ')
      s++;
  }
  printf("%d",s+1);
  return 0;
}