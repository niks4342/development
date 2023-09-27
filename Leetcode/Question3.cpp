//   /* power of two*/// 
// max range of int is -2^32 to 2^31-1

 #include<iostream>
 #include<math.h>
 using namespace std;

 int main()
 {
    int n=0;
    cout<<"Enter a number:\n";
    cin>>n;
    
    // for( int i=0;i<30;i++)
    // {
    //    int ans=pow(2,i);
    //    if(ans==n)
    //    {
    //     cout<<"true\n";
    //     break;
    //    }
        
    // }
    int ans=1;
    for( int i=1;i<30;i++)
    {
      
       if(ans==n)
       {
        cout<<"true\n";
        break;
       }
        ans=ans*2;
        
    }

    return 0;
 }