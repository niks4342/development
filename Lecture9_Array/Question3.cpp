// find 2^x=n

#include<iostream>
using namespace std;

bool Power(int n)
{
    int icnt=0;
    while(n!=0)
    {
        if(n&1==1)
        {
            icnt++;
        }
        n=n>>1;
    }
    
    
    if(icnt==1)
    {
        return true;
    }
    else
    {
        return false;
    }
    
}


int main()
{
    int n=0;
    cout<<"Enter the number:\n";
    cin>>n;

    bool bret=Power(n);  
    if(bret==true)
    {
        cout<<"YES it is the power of 2^x";
    }  
    else
    {
        cout<<"NO it is not the power of 2^x";
    }

    return 0;
}