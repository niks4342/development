
import java.util.*;

class Question5
{
    static  int ret=0;
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
         for(int j=i+1;j<size;j++)
         {
            ans=arr[i]^arr[j];
            if(ans==0)
            {
                System.out.println(".."+arr[i]);
                ret=arr[i];
                
            }
            break;
         }
         
       }

       System.out.println("Duplicate is:"+ret);
        
    }
}
