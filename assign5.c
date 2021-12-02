// Write a program which accept number from user and count frequency of such a  digits which are less than 6.


#include<stdio.h>
int count(int ino)
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
        if(idigit<6)
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
  
iRet = Count(iValue); 

printf("Frequency of number less than 6 is :%d",iRet); 
return 0; 
}