#include<stdio.h>
int main()
{
  float a,r,l;
  scanf("%f%f",&a,&r);
  l=2*3.14*a*r/360;
  printf("%.2f",l);
  return 0;
}