import java.util.*;

class arr
{
    public static void main(String[] args) 
    {

        Scanner sobj=new Scanner(System.in);
        int size=0;
        System.out.println("Enter size of an array:");
        size=sobj.nextInt();
        int a[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            a[i]=sobj.nextInt();
        }
        
        arr obj=new arr();
        obj.EmptyPack(a);
    }

    public void EmptyPack(int[] a)
    {   
        int icnt=0;
        // put all non-zero elements at beginging
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                a[icnt]=a[i];
                icnt++;
            }
        
        }
// fill remaining positions with 0's
        for(int i=icnt;i<a.length;i++)
        {
            a[i]=0;
        }

        System.out.println("Enterd array is:");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}