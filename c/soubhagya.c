#include<stdio.h>
void main()
{
  int age;
  printf("Enter age of the person");
  scanf("%d",&age);
  if(age>=18)
  {
    printf("he is eligible for voting");
  }
  else{
    printf("he is not eligible for voting" );
  }
}