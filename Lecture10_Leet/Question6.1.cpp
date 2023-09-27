//intersection of an sorted array(2)


#include<iostream>
#include <bits/stdc++.h>
using namespace std;

void Intersection(int arr[],int size1,int size2,int arr2[])
{
   
    int i=0,j=0;
    vector<int> ans;
    while(i<size1 && j<size2)
    {
    
        if(arr[i]==arr2[j])
        {
            
            ans.push_back(arr[i]);
            i++;
            j++;
        }
     
        else if(arr[i]<arr2[j])
        {
            i++;
        }
        else if(arr[i]>arr2[j])
        {
            j++;
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