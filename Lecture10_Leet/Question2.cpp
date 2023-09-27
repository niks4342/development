//Find unique number from an array

#include<iostream>
using namespace std;

int Unique(int arr[],int size)
{
    int ans=0;
  for(int i=0;i<size;i++)
  {
    ans=ans^arr[i];
  }
  return ans;

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
 
    int iret=Unique(arr,size);

    cout<<"Unique element is:"<<iret<<"\n";

    return 0;
}