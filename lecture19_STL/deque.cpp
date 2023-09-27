#include<iostream>
#include<deque>

using namespace std;

// doubly ended queue
// insertion and deletion from both sides of queue
// it is dynamic
// random access possible

int main()
{
    deque<int > d;
    d.push_back(1);
    d.push_front(2);
    d.push_front(3);
    for(int i:d)
    {
        cout<<i<<" ";
    }cout<<endl;

    // d.pop_back();//pop 1

    // for(int i:d)
    // {
    //     cout<<i<<" ";
    // }cout<<endl;

    cout<<"0th index :"<<d.at(0)<<endl;

    cout<<"Is it empty or not:"<<d.empty()<<endl;

    cout<<"size before delete:"<<d.size()<<endl;

    // delete by specifing the start and end point
    d.erase(d.begin(),d.begin()+1);//will delete 1st element i.e 3

    for(int i:d)
    {
        cout<<i<<" ";
    }cout<<endl;

    cout<<"size after delete:"<<d.size()<<endl;


    return 0;
}