#include<stdio.h>
int main()
{
  	//type your code here
  int n,i,a[100],m=-1110;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    if(m<a[i])
      m=a[i];
  }
  printf("%d",m);
}