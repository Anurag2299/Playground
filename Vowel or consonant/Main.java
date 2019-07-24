#include<stdio.h>
int main()
{
  //type your code here
  char c,d;
  scanf("%c",&c);
  if(c<93)
  {
    d=c+32;
    if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
      printf("Vowel");
    else
      printf("Consonant");
  }
  else
  {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
      printf("Vowel");
    else
      printf("Consonant");
  }
  return 0;
}