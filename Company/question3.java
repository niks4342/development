import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int no=0;
        System.out.println("Enter number:");
        no=sobj.nextInt();

        int product=1;

        while(no>0)
        {
            int digit=no%10;
            product=product*digit;
            no/=10;
        }
        System.out.println("product of digits:"+product);
    }
}
