public class evenRange {
    public static void main(String[] args) {
        
        int start=1;
        int end=20;
System.out.println("Even numbers within range:");
        for(int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }

        System.out.println("Prime numbers or not:");

        // for num: if(nums<=1) then return false
      int num=10;
      if(num<=1)
      {
        System.out.println("NO");
        return;
      }

      for(int i=2;i<num/2;i++)
      {
        if(num%i==0)
        {
            System.out.println("NO");
            break;
        }
        else{
            System.out.println("YES");
            break;
        }
      }
    
    }
}
