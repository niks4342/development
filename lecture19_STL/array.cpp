#include<iostream>
#include<array>
using namespace std;

int main()
{
    // normal
    int arr[5]={1,2,3,4,5};

    // STL
    array<int,5> brr={1,2,3,4,5};
    int size=brr.size();
    for(int i=0;i<size;i++)
    {
        cout<<brr[i]<<" "<<endl;
    }
    cout<<"2nd:"<<brr.at(2)<<"\n";//O(1)
    // check whether the array is empty or not
    cout<<"Empty :"<<brr.empty()<<"\n";//return bool

    // 1st and last element
    cout<<"first:"<<brr.front()<<endl; //O(1)
    cout<<"last:"<<brr.back()<<endl;
}