import java.util.Scanner;

/**
 * 
 we have array of candies and also given extra candies we need to find
if is there any way to distribute extra candies such that the kid
has max no of candies 

n=no. of elemnts in array
candies= array
extra candies

5
2,3,5,1,3
3

output == 1,1,1,0,1
 */
public class candy {
    public static void main(String[] args) {
        
        Scanner sobj=new Scanner(System.in);
        int n=0;
        System.out.println("Enter N:");
        n=sobj.nextInt();

        int extra=0;
        System.out.println("Enter extra candies:");
        extra=sobj.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter candies in array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sobj.nextInt();
        }

        int[] ret=new int[n];

        int max=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }

        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]+extra >=max)
            {
                ret[i]=1;
            }
            else
            {
                ret[i]=0;
            }
        }

        System.out.println("result array:");
        for(int i=0;i<n;i++)
        {
            System.out.println(ret[i]);
        }


    }
}
