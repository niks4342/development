#include<iostream>
#include<array>
using namespace std;


int main()
{
    array<int,4> arr={1,2,3,4};

    int size=arr.size();

    for(int i=0;i<size;i++)
    {
        cout<<arr[i]<<endl;
    }

    cout<<"Element at 2nd index:"<<arr.at(2)<<endl;
    cout<<"Empty or not:"<<arr.empty()<<endl;

    cout<<"First element:"<<arr.front()<<endl;

    return 0;
}

