#include<stdio.h>
void main()
{
    int a,b,c,d;
    printf("Enter four number");
    scanf("%d%d%d%d",&a,&b,&c,&d);
    if(a>b && b>c && c>d)
    {
        printf("A is larger");
    }
     else if(b>c && c>d )
    {
        printf("b is greater");
    }
    else if(c>d)
    {
        printf("c is greater");
    }
    else 
    {
        printf("d is greater");
}

}

   