#include<stdio.h>
#include<string.h>
int main()
{
  char a[100];
  int i;
  gets(a);
  for(i=0;i<strlen(a);i++)
  {
    if(!(a[i]=='A'||a[i]=='E'||a[i]=='i'||a[i]=='O'||a[i]=='U'||a[i]=='I'||
       a[i]=='a'||a[i]=='e'||a[i]=='o'||a[i]=='u'))
      printf("%c",a[i]);

  }
  return 0;
}