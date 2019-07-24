#include<stdio.h>
int main()
{
  	//type your code here
  int n,a[90],i;
  int t,r,j=-1,k=-1;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&t,&r);
    for(i=0;i<n;i++)
  {
    if(t==a[i])
      j=i;
    if(r==a[i])
      k=i;
  }
  printf("Element 1 index = %d\n",j);
  printf("Element 2 index = %d",k);
  return 0;
}