#include<iostream>
#include<deque>
using namespace std;


int main()
{
  deque<int> d;

  d.push_back(1);
  d.push_front(2);

  for(int i:d)
  {
    cout<<i<<" ";
  }
  cout<<endl;

//     d.pop_front();
    for(auto i=d.begin();i<d.end();i++)
  {
    cout<<*i<<" ";
  }
  cout<<endl;

cout<<"1st index elements:"<<d.at(1)<<endl;
cout<<"Front:"<<d.front()<<endl;

    return 0;
}
