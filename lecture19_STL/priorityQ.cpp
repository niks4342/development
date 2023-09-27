#include<iostream>
#include<queue>
using namespace std;

// default Q is always MAX heap
// max heap : when we fetch any element then it is always maximum ele
// min heap : when we fetch any element then it is always minimum ele

int main()
{
    priority_queue<int> max;//max heap

    priority_queue<int ,vector<int>,greater<int>> min;//min heap

    max.push(1);
    max.push(5);
    max.push(3);
    max.push(2);

    int n=max.size();
    cout<<"Max :\n";
    for(int i=0;i<n;i++)
    {
        cout<<max.top()<<" ";
        max.pop();
    }cout<<endl;

    
    min.push(2);
    min.push(3);
    min.push(1);
    min.push(6);

    int n1=min.size();
    cout<<"Min :\n";
    for(int i=0;i<n1;i++)
    {
        cout<<min.top()<<" ";
        min.pop();
    }cout<<endl;

    // now both max and min are empty.

    return 0;
}