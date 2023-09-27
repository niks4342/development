// Find all duplicates in an array


#include<iostream>
#include <bits/stdc++.h>
#include<unordered_map>
using namespace std;


vector<int> AllDuplicate(int arr[],int size)
{
    vector<int> ans;
    unordered_map<int,int> mp;

    for(int i=0;i<size;i++)
    {
        mp[arr[i]]++;
    }

// traversing the map
    for(auto i:mp)
    {
        cout<<i.first<<" "<<i.second<<"\n";
        if(i.second==2) //i.seond means <int,int> second int i.e frequency of particular no.
        {
            ans.push_back(i.first);
        }
    }
    // Print vector
    cout<<"Duplicate elemets are:\n";

    for(auto i=ans.begin();i!=ans.end();i++)
    {
        cout<<*i<<"\n";
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
    vector<int> iret= AllDuplicate(arr,size);
  

    return 0;
}