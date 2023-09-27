// return the paire of elements of an array with sum 'n'


#include<iostream>
#include <bits/stdc++.h>
using namespace std;

void PairSum(int arr[],int size,int n)
{
   vector< vector<int>> ans;
  for(int i=0;i<size;i++)
  {
    for(int j=i+1;j<size;j++)
    {
        if((arr[i]+arr[j])==n)
        {
            vector<int> temp;
            temp.push_back(min (arr[i],arr[j]));
            temp.push_back(max (arr[i],arr[j]));
            ans.push_back(temp);
        }
    }
  }
  sort(ans.begin(),ans.end());
   cout<<"Pairs are:\n";
    for(int i=0;i<ans.size();i++)
    {
        for(int j=0;j<ans.size();j++)
        {
            cout<<ans[i][j]<<" ";
        }
        cout<<endl;
    }
}


int main()
{

    int size=0;
    int no=0;
    cout<<"Enter size of an array:\n";
    cin>>size;

    int arr[size]={0};
    cout<<"Enter array elements:\n";
    for(int i=0;i<size;i++)
    {
        cin>>arr[i];
    }
    cout<<"Enter no:\n";
    cin>>no;
    
   PairSum(arr,size,no);
    

    return 0;
}