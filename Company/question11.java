// rotate an array by k

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int n=0;
        System.out.println("Enter size of array:");
        n=sobj.nextInt();

        int k=0;
        System.out.println("Enter with how many position rotate array:");
        k=sobj.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sobj.nextInt();
        }
        /////////////////////////////////

        int[] ans=new int[n];
        int i=0;
        while(i<n)
        {
            ans[(i+k)%n] = arr[i];
            i++;
        }

        System.out.println("Rotated array is:");
        for(int j=0;j<n;j++)
        {
           System.out.println(ans[j]);
        }
    }
}
