/*
 
4 -> Value of N

{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is 
separated by a new line
12 -> Value of D, i.e. date 
200 -> Value of x i.e. fine


Output:
600  -> total fine collected 

Explanation:
Date D=12 means , only an even number of vehicles are allowed. 
Find will be collected from 5,3 and 7 with an amount of 200 each.
Hence, the output = 600.
 */

import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int n=0;
        System.out.println("Enter N:");
        n=sobj.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sobj.nextInt();
        }

        int date=0;
        System.out.println("Enter date:");
        date=sobj.nextInt();

        int fine=0;
        System.out.println("Enter fine:");
        fine=sobj.nextInt();

        ////////////////////////////////////////////////

        if(date%2==0)
        {
            int icnt=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2!=0)
                {
                    icnt++;
                }
            }
            System.out.println("fine will be(for even date):"+icnt*fine);
        }
        else
        {
            int icnt=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]%2==0)
                {
                    icnt++;
                }
            }
            System.out.println("fine will be(for odd date):"+icnt*fine);
        }

    }
}
