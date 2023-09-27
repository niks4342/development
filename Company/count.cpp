// •	Find the number of times digit 3 occurs in each 
// and every number from 0 to n


/////////////////////////////////////////////

// •	The sum of digits in the given number

#include<iostream>
using namespace std;


int CountOccurances(int n)
{
    int icnt=0;
    
    while(n>0)
    {
        int digit=n%10;
        if(digit==3)
        {
            icnt++;
        }
        n/=10;
    }

    return icnt;

}

int SumOfDigits(int n)
{
    int sum=0;

    while(n>0)
    {
        int digit=n%10;
        sum+=digit;
        n/=10;
    }
    return sum;
}

int main()
{
    int num=0;
    cout<<"Enter number:\n";
    cin>>num;

    int ans1=CountOccurances(num);
    cout<<"occurences of '3':"<<ans1<<"\n";


    int ans2=SumOfDigits(num);
    cout<<"Sum of all digits:"<<ans2;




    return 0;
}