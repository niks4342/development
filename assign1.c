//.Write a program which accept number from user and display its digits in reverse  order 


#include<stdio.h>
void DisplayDigit(int ino)
{
    int idigit=0;
    

    while (ino!=0)
    {
        idigit=ino%10;
        printf("%d\n",idigit);
        ino=ino/10;
    }
    
}

int main() 
{ 
int iValue = 0; 

printf("Enter number:\n"); 
scanf("%d",&iValue); 

DisplayDigit(iValue); 
return 0; 
} 

