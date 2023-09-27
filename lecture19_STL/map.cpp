#include<iostream>
#include<map>
using namespace std;

// key : value
// same key cannot point to two different values
// but to different keys can point to same value
// inplimentation is done using balaced tree
// unordered map implimented using hashtable

int main()
{

    map<int,string> m;

    m[1]="Nikita";
    m[2]="Veer";
    m[3]="Ravi";    
    m[1]="Hello";//duplicate keys are not allowed

 

    // m.insert(4,"Kiran");
    for(auto i:m)
    {
        cout<<i.first<<" ";//i.first => give the key
        cout<<i.second<<endl;// i.second => give the value
    }

    cout<<"finding 3 :"<<m.count(3)<<endl;

    return 0;
}