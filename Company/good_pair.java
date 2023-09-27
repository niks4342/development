import java.util.*;

public class good_pair {
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
        /////////////////////////////
        // complexity O(n^2)
        int icnt=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j] && i<j)
                {
                    icnt++;
                }
            }
        }
        System.out.println("Good pairs are: "+icnt);


        // optimal complexity => O(n)
        // using hashmap

        HashMap<Integer,Integer> hmap=new HashMap<>();

        for(int i=0;i<n;i++)
        {
            if(hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else
            {
                hmap.put(arr[i], 1);
            }
        }

        int ret=0;
        for(int val:hmap.values())
        {
            ret=ret+((val-1)*val)/2;
        }
        System.out.println("Good pairs:"+ret);
    }
}
