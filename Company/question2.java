// Given an integer array Arr of size N the task is to 
// find the count of elements whose value is greater 
// than all of its prior elements.

// Arr[]={7,4,8,2,9}
//  output = 3.

import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {
         Scanner sobj=new Scanner(System.in);
        int size=0;
        System.out.println("Enter size of an array:");
        size=sobj.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=sobj.nextInt();
        }

        int icnt=0;
        int maxSoFar=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maxSoFar)
            {
                maxSoFar=arr[i];
                icnt++;
            }
          
        }

        System.out.println("count is:"+icnt);
    }
    
}
