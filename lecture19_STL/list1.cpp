#include<iostream>
#include<list>
using namespace std;
// doubly LL=List

int main()
{
    
    list<int> l;

    l.push_back(1);
    l.push_front(2);
    for(int i:l)
    {
        cout<<i<<" ";
    }
    cout<<endl;
    
    // all elements in l copy in list n
    list<int> n(l);
    // for delete we have erase
    // l.begin() jise point karega usiko delete/erase kar dega 
    // that's why we use pointer for printing

    cout<<"Size:"<<l.size()<<endl;
    return 0;
}
