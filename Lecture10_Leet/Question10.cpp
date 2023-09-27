// sort 0,1,2


#include<iostream>
#include <bits/stdc++.h>
#include<unordered_map>
using namespace std;

void Sorting(int arr[],int size)
{
 
    vector<int> ans;
    unordered_map<int,int> mp;
    for(int i=0;i<size;i++)
    {
        mp[arr[i]]++;
    }
    cout<<"Count of each element:\n";
    for(auto i:mp)
    {
        cout<<i.second<<"\n";

       if(i.first==0)
       {
         while(i.second!=0)
        {
            ans.push_back(i.first);
            i.second--;
        }
       }
       
       else if(i.first==1)
       {
         while(i.second!=0)
        {
            ans.push_back(i.first);
            i.second--;
        }
       }
       
       else if(i.first==2)
       {
         while(i.second!=0)
        { 
            ans.push_back(i.first);
            i.second--;
        }
       }
        
    }
    
    for(auto i=ans.begin();i<ans.end();i++)
    {
        cout<<*i<<" ";
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