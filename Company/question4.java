import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt ();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt ();


        int d = sc.nextInt ();
        int x = sc.nextInt ();
        int countEven = 0, countOdd = 0;

        
        if(d%2==0)
        {
            int icnt=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]!=0)
                {
                    icnt++;
                }
            }
            int ans=icnt*x;
            System.out.println(ans);
        }
        else if(d%2!=0)
        {
            int icnt=0;
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    icnt++;
                }
            }
            int ans=icnt*x;
            System.out.println(ans);
        }


    }
}
