// find duplicate of an array


#include<iostream>
using namespace std;

int Duplicate(int arr[],int size)
{
    // for(int i=0;i<size;i++)
    // {
    //     int ans=0;
    //     for(int j=(i+1);j<size;j++)
    //     {
    //         ans=arr[i]^arr[j];
    //         if(ans==0)
    //         {
    //             return arr[i];
    //             break;
    //         }
    //     }
    // }

    // ******* Another approch
    int ans=0;
    for(int i=0;i<size;i++)
    {
        ans=ans^arr[i];
    }

    for(int i=1;i<size;i++)
    {
        ans=ans^i;
    }
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
    int iret= Duplicate(arr,size);
    cout<<"Duplicate is:"<<iret<<"\n";

    return 0;
}