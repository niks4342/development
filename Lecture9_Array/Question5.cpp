// reverse the array

#include<iostream>
using namespace std;

void Reverse(int arr[],int size)
{
   int start=0;
   int end=size-1;

   while(start<=end)
   {
        swap(arr[start],arr[end]);
        start++;
        end--;
   }
    cout<<"Reverse array is:\n";
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
 
    Reverse(arr,size);
    

    return 0;
}