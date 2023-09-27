// complement of base 10 integer

//  reverse the Integer
 #include<iostream>
 using namespace std;

 int main()
 {
    int n=0;
    cout<<"Enter a number:\n";
    cin>>n;

    int ans=~n;
    int mask=0;
    int icnt=0;
    if(n==0)
    {
        cout<<"ans=1\n";
    }
   while(n!=0)
   {
        n=n>>1;
        icnt++;//3
   }
 

   while(icnt!=0)//mask=00000....00111
   {
       
        mask=mask<<1;
        mask=mask | 1;
        icnt--;
   }
//    ********** Small Code *******
    // int m=n;
    // int mask=0;

    // while(n!=0)
    // {
    //     mask=(mask<<1)|1;
    //     m=m>>1
    // }


    if(n!=0)
    {
           int x=ans&mask;
        cout<<x;

    }
    return 0;
 }