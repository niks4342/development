//  reverse the Integer
 #include<iostream>
 using namespace std;

 int main()
 {
    int n=0;
    cout<<"Enter a number:\n";
    cin>>n;
    int rev=0;
    while(n!=0)
    {
        int digit=n%10;
        if((rev>INT16_MAX/10)||(rev<INT16_MIN/10))
        {
            cout<<"revese is 0\n";
            break;
        }
        rev=rev*10+digit;
        n=n/10;
        
    }

    cout<<"Revere is:"<<rev<<"\n";

    return 0;
 }