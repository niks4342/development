#include<iostream>
#include<queue>
using namespace std;

// 

int main()
{
    queue<string> q;

    q.push("Nikita");
    q.push("Birajdar");
    
    cout<<"1st :"<<q.front()<<endl;

    // same pop()
    cout<<"size: "<<q.size()<<endl;

    return 0;
}