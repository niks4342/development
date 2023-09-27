//intersection of an array


#include<iostream>
#include <vector>
using namespace std;

int Intersection(int arr[],int size1,int size2,int arr2[])
{
   vector<int> ans;
    for(int i=0;i<size1;i++)
    {
        
        int element=arr[i];
        for(int j=0;j<size2;j++)
        {
            if(element<arr2[j])
            {
                break;
            }
            if(element==arr2[j])
            {
                ans.push_back(element);
                arr2[j]=INT_MIN;
                break;
            }
        }
    }

    cout<<"Intersection is:\n";
    for(auto i=ans.begin();i!=ans.end();i++)
    {
        cout<<*i<<" ";
    }
}


int main()
{

    int size1=0,size2=0;
    cout<<"Enter size of an array:\n";
    cin>>size1;

    int arr[size1]={0};
    cout<<"Enter array elements:\n";
    for(int i=0;i<size1;i++)
    {
        cin>>arr[i];
    }

    cout<<"Enter size of an array:\n";
    cin>>size2;
    int arr2[size2]={0};
    cout<<"Enter array elements:\n";
    for(int i=0;i<size2;i++)
    {
        cin>>arr2[i];
    }

   Intersection(arr,size1,size2,arr2);
    

    return 0;
}