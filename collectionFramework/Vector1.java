import java.util.Vector;
import java.util.*;


public class Vector1 {
    public static void main(String[] args) {
        Vector1 obj=new Vector1();

        obj.implimentation();
    }

    public void implimentation()
    {
        Vector<Integer> v=new Vector<Integer>(5);

        v.add(10);
        v.add(20);
        v.add(30);
        v.add(null);
        v.add(null);
        v.add(null);

        for(Integer i:v)
        {
            System.out.println(i); 
        }

        Iterator<Integer> it= v.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
System.out.println();
        System.out.println(v.lastElement());
        System.out.println(v.capacity());
        System.out.println(v.contains(10));
        



    }
    
}
