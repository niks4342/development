// Triplets with given sum

#include<iostream>
#include <bits/stdc++.h>
using namespace std;

void PairSum(int arr[],int size,int n)
{
    vector<vector <vector<int>>> ans;
  for(int i=0;i<size;i++)
  {
    for(int j=0;j<size;j++)
    {
        for(int k=0;k<size;k++)
        {
            if((arr[i]+arr[j]+arr[k])==n)
            {
                // vector<vector<int>> temp1;
                // vector<int> x;
                // x.push_back(arr[i]);
                // x.push_back(arr[j]);
                // temp1.push_back(x);
                // ans.push_back(temp1);

                cout<<arr[i]<<" "<<arr[j]<<" "<<arr[k]<<"\n";
            }
        }
    }
  }
    //  cout<<"Pairs are:\n";
    // for(int i=0;i<ans.size();i++)
    // {
    //     for(int j=0;j<ans.size();j++)
    //     {
    //         for(int k=0;k<ans.size();k++)
    //         {
    //             cout<<ans[i][j][k]<<" ";
    //         }
    //         cout<<endl;
    //     }
    //     cout<<endl;
    // }
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