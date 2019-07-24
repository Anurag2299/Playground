// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int gcd(int a,int b)
{
  if(a%b==0)
    return b;
  else
    gcd(b,a%b);
}
int main()
{
  // Enter your code here 
  int a,b,x;
  scanf("%d %d",&a,&b);
  x=gcd(a,b);
  printf("%d",x);
   return 0;
}