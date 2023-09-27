import java.util.*;
import java.util.ArrayList;
class Question04
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
        
        int icnt=0;
      ArrayList<Integer> list=new ArrayList<Integer>();
      ArrayList<Integer> list1=new ArrayList<Integer>();

      for(int i=0;i<size;i++)
      {
        icnt=0;
        for(int j=0;j<size;j++)
        {
            if(arr[i]==arr[j])
            {
                icnt++;
            }
        }
// add only such values which are not duplicate
        if(!(list1.contains(arr[i])))
        {
            list1.add(arr[i]);
            list.add(icnt);
        }
      }
        int ret[]=new int[list.size()];

        for(int i=0;i<ret.length;i++)
        {
            ret[i]=list.get(i);
        }

        for(int i=0;i<ret.length;i++)
        {
            if(i+1<ret.length)
            {
                if(ret[i]==ret[i+1])
                {
                    System.out.println("false");
                    break;
                }
                
            }
            
        }
        System.out.println("True");
        
    }
}