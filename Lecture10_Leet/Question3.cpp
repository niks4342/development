//Find unique number from an array

#include<iostream>
#include<unordered_map>
#include<unordered_set>
using namespace std;

bool UniqueOccurence(int arr[],int size)
{
    
    for(int i=0;i<size;i++)
    {
        int icnt=0,x=0;
        for(int j=0;j<size;j++)
        {
            if(arr[i]==arr[j])
            {
                icnt++;
                x=x^icnt;
            }
        }
        
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
 
    bool ret=UniqueOccurence(arr,size);
    if(ret)
    {
        cout<<"True\n";
    }
    else
    {
        cout<<"False\n";
    }

    return 0;
}