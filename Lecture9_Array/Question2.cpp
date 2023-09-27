// find sum of all elements of an array

#include<iostream>
using namespace std;

int Sum(int arr[],int size)
{
    
    int sum=0;
    for(int i=0;i<size;i++)
    {
        sum=sum+arr[i];
    }
    return sum;
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
    

    int iret=Sum(arr,size);
    cout<<"Summation is:"<<iret<<"\n";

    return 0;
}