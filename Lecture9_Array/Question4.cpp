// given number is present or not

#include<iostream>
using namespace std;

bool LinearSearch(int arr[],int size,int n)
{
    bool flag=false;
    for(int i=0;i<size;i++)
    {
        if(arr[i]==n)
        {
           flag= true;
            break;
        }

    }
    return flag;
}


int main()
{

    int size=0;
    cout<<"Enter size of an array:\n";
    cin>>size;

    int arr[size]={0};
    cout<<"Enter array elements:\n";
    for(int i=0;i<size;i++)
    {
        cin>>arr[i];
    }
    cout<<"Your enterd array elements:\n";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
    }

    int n=0;
    cout<<"Enter the number to search:\n";
    cin>>n;

    bool iret=LinearSearch(arr,size,n);
    if(iret)
    {
        cout<<"Number is present\n";
    }
    else
    {
        cout<<"Number is not present\n";
    }
    

    return 0;
}