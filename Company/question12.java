/*
 Problem Description -:  Given two non-negative integers n1 and n2, where n1

For example:

Suppose n1=11 and n2=15.

There is the number 11, which has repeated digits, but 12, 13, 14 and 15 
have no repeated digits. So, the output is 4.
 */

import java.util.*;

public class question12 {
    public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        int n1=0;
        System.out.println("Enter n1:");
        n1=sobj.nextInt();
        int n2=0;
        System.out.println("Enter n2:");
        n2=sobj.nextInt();

        ///////////////////////////////////////////
        int size=(n2-n1)+1;
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=n1;
            n1++;
        }
        
      question12 obj=new question12();
      int icnt=obj.CheckCount(arr);
        System.out.println("count of no's that do no conatins duplicate digits:"+icnt);
        
    }

    public int CheckCount(int[] arr)
    {
        int icnt=0;
        for(int num:arr)
        {
            if(hasDuplicateDigit(num)==false)
            {
                icnt++;
            }
        }
        return icnt;
    }

    public boolean hasDuplicateDigit(int n)
    {
        Set<Integer> duplicateDigit=new HashSet<>();

        while(n>0)
        {
            int digit=n%10;
            if(duplicateDigit.contains(digit))
            {
                return true;
            }
            duplicateDigit.add(digit);
            n/=10;
        }
        return false;
    }
}
