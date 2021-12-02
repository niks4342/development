//Write a program which accept number from user and check whether it contains 0  in it or not.

#include<stdio.h>
#include<stdbool.h>
bool CheckZero(int ino)
{
    int idigit=0;

    while (ino!=0)
    {
        idigit=ino%10;
        
        if(idigit==0)
        {
            return true;
        }
        ino=ino/10;
    }
    
}


int main() 
{ 
int iValue = 0; 
bool bRet = false; 
 
printf("Enter number\n"); 
scanf("%d",&iValue); 
bRet = CheckZero(iValue); 
if(bRet == true) 
{ 
printf("It Contains Zero"); 
} 
else 
{ 
printf("There is no Zero"); 
} 
return 0; 
} 
