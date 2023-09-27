

import java.util.*;

class Question2
{
    public static void main(String[] args) 
    {

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
       
        for(int i=0;i<size-1;i++)
        {
            int temp=0;
            if(i+1<size)
            {
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            i=i+1;
        }
        System.out.println("Array after swaping is:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
    }
}