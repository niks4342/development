//  The string is considered valid if the number of ‘*’ and ‘#’ are equal. 
// The ‘*’ and ‘#’ can be at any position in the string.

// we can make use of count as well 
// if count of * and # is equal 
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        String str="";
        System.out.println("Enter string:");
        str=sobj.nextLine();


        Map<Character,Integer> map=new HashMap<>();
        char[] ch=str.toCharArray();

        int icnt=0;
        for(char c:ch)
        {
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            }
            else
            {
                map.put(c, 1);
            }
        }

        int i=0;
        int[] ans=new int[map.size()];
        for(int value:map.values())
        {
            ans[i++]=value;
        }

        for(int j=0;j<map.size()-1;j++)
        {
            if(ans[j]==ans[j+1])
            {
                System.out.println("string is valid");
            }
            else
            {
                if(ans[j]<ans[j+1])
                {
                    int a=ans[j+1]-ans[j];
                    System.out.println(a);
                    
                }
                else
                {
                    int a=ans[j]-ans[j+1];
                    System.out.println(a);
                }
            }
        }
    }
    
}



