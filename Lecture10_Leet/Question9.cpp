// sort 0,1


#include<iostream>
using namespace std;

void Sorting(int arr[],int size)
{
    int i=0,j=size-1;

    while(i<j)
    {
        while(arr[i]==0 && i<j)
        {
            i++;
        }
        while(arr[j]==1 && i<j)
        {
            j--;
        }
        if(arr[i]==1 && arr[j]==0 && i<j)
        {
            swap(arr[i],arr[j]);
            i++;
            j--;
        }
    }
    cout<<"Final array is:\n";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i];
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
    Sorting(arr,size);
  

    return 0;
}