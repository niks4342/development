import java.util.*;

class Question3
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
        int ans=0;

        for(int i=0;i<size;i++)
        {
            
            ans=ans^ arr[i];
            
        }

        System.out.println("Result is:"+ans);
        
    
    }
}