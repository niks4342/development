#include<iostream>
#include<map>
using namespace std;

// key is unique
int main()
{
   map<int,string> m;

   m[1]="Nikita";
   m[12]="Veer";
   m[2]="Birajdar";

    m.insert({5,"Ravi"});

   for(auto i:m)
   {
    cout<<i.first<<endl;
   }
    
    cout<<"firnding 13:"<<m.count(13);
    return 0;
}
