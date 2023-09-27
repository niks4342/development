#include<iostream>
#include<list>
using namespace std;
// list= doubly link list
// therefore random access is not possible we have to traverse


int main()
{
    list<int> l;

    l.push_back(1);
    l.push_front(2);
    l.push_front(3);

    for(int i:l)
    {
        cout<<i<<" ";
    }cout<<endl;

    // we have begin(),end(),empty() => O(1)
    // erase() => O(n) because we have to traverse
    // pop_back(),

    cout<<"size:"<<l.size()<<endl;

    // copy list in new list
    list<int> n(l);
    //list<int> n(5,100);//5 elements & all initialize to 100 
    cout<<"Output with new list: ";
    for(int i:n)
    {
        cout<<i<<" ";
    }cout<<endl;

    return 0;
}