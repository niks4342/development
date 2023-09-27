// SwapAlternate

#include<iostream>
using namespace std;

void SwapAlternate(int arr[],int size)
{
    int i=0;
    while((i+1)<size)
    {
        swap(arr[i],arr[i+1]);
        i+=2;
    }
    cout<<"Swapped array:\n";
    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<" ";
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
 
    SwapAlternate(arr,size);
    

    return 0;
}