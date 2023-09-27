#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

int main()
{
    vector<int> v;

    v.push_back(1);
    v.push_back(3);
    v.push_back(6);
    v.push_back(7);

    cout<<"Binary search Implimentation using inbuilt algorithms:\n";
    cout<<"finding 5:"<<binary_search(v.begin(),v.end(),5)<<endl;//return bool
    cout<<"finding 6:"<<binary_search(v.begin(),v.end(),6)<<endl;//return bool

    // to find the iterator i.e lower bound
    cout<<"lower bound(6):"<<lower_bound(v.begin(),v.end(),6)-v.begin()<<endl;
    cout<<"upper bound(6):"<<upper_bound(v.begin(),v.end(),6)-v.begin()<<endl;

    // swap(a,b),max(a,b)
    string s="Nikita";
    reverse(s.begin(),s.end());
    cout<<"reverse string is:"<<s<<endl;

    // rotate
    rotate(v.begin(),v.begin()+1,v.end());
    cout<<"after rotate:\n";
    for(int i:v)
    {
        cout<<i<<" ";
    }cout<<endl;

    // sort
    // it is based on intro-sort. It is the combination of 3 algo
    // quick + heap + insertion sort i.e intro-sort
    
    sort(v.begin(),v.end());

    cout<<"after sort:\n";
    for(int i:v)
    {
        cout<<i<<" ";
    }cout<<endl;

    return 0;
}