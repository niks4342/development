import java.util.*;

class Question1
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
        
        System.out.println("Enterd array is:");
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}