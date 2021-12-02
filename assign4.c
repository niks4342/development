//Write a program which accept number from user and count frequency of 4 in it.

#include<stdio.h>
int CountFour(int ino)
{
    int idigit=0;
    int icnt=0;

    if(ino<0)
    {
        ino=-ino;
    }

    while(ino>0)
    {
        idigit=ino%10;
        if(idigit==4)
        {
            icnt++;
        }
        ino=ino/10;
    }
    return icnt;
}

int main() 
{ 
int iValue = 0; 
int iRet = 0; 
printf("Enter number\n"); 
scanf("%d",&iValue); 
  
iRet = CountFour(iValue); 

printf("Frequency of 4 in given number is:%d",iRet); 
return 0; 
}