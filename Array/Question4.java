import java.util.*;

class Question4
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
       
        
         int ret[]=new int[size];
        // int visited[]=new int[size];
        // for(int i=0;i<size;i++)
        // {
        //     int icnt=1;
        //     if(i+1<size)
        //     {
        //         visited[i]=arr[i];
        //     }
        //     for(int j=i+1;j<size;j++)
        //     {
        //         if(arr[i]==arr[j] && i!=j && visited[i]!=arr[i])
        //         {
        //             icnt++;
        //             break;
        //         }
        //     }

        //     ret[i]=icnt;
            
        // }

        // System.out.println("Count :");
        // for(int i=0;i<size;i++)
        // {
        //     System.out.println(ret[i]);
        // }

        // int ret[1000]={0};
            for(int i=0;i<size;i++)
            {
                int icnt=0;

                for(int j=i+1;j<size;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        icnt++;
                    }
                }
            }

        
    
    }
}