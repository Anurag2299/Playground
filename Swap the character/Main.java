#include<stdio.h>
#include<string.h>
int main()
{
  // type your code here 
  char a[100],b[100],c[100];
  int i;
  scanf("%s",a);
  scanf("%s",b);
  scanf("%s",c);
  for(i=0;i<strlen(a);i++)
  {
    if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'
      ||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
             a[i]='$';
  }
    for(i=0;i<strlen(b);i++)
  {
    if(b[i]!='A'&& b[i]!='E'&& b[i]!='I'&& b[i]!='O'&& b[i]!='U'
      &&b[i]!='a'&&b[i]!='e'&&b[i]!='i'&&b[i]!='o'&&b[i]!='u')
        b[i]='#';
  }
  for(i=0;i<strlen(c);i++)
  {
    if(c[i]>96)
      c[i]-=32;
  }
  printf("%s%s%s",a,b,c);
  return 0;
}