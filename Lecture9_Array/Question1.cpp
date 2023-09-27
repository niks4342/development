// find max and min of array

#include<iostream>
using namespace std;

int Maximum(int arr[],int size)
{
    int max=arr[1];
    for(int i=0;i<size;i++)
    {
        if(max<arr[i])
        {
            max=arr[i];
        }
    }
    return max;
}

int Minimum(int arr[],int size)
{
    int min=arr[1];
    for(int i=0;i<size;i++)
    {
        if(min>arr[i])
        {
            min=arr[i];
        }
    }
    
    return min;
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

    int max=Maximum(arr,size);
    cout<<"\nMaixmum is:"<<max<<"\n";
    int min=Minimum(arr,size);
    cout<<"Minimum is:"<<min<<"\n";

    return 0;
}