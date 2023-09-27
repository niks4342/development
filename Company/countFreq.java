// •	Count the frequency of each element of an array

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class countFreq {
    public static void main(String[] args) {

        Scanner sobj=new Scanner(System.in);

        int[] arr=new int[5];
        System.out.println("Enter array elements:\n");
        for(int i=0;i<5;i++)
        {
            arr[i]=sobj.nextInt();
        }


        ////////////////////////////////////////////

        Map<Integer,Integer> map=new HashMap<>();

        for(Integer i:arr)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else
            {
                map.put(i, 1);
            }
        }

        System.out.println("Frequency of each elemnt in array:\n");
        for(int val:map.values())
        {
            System.out.println(val);
        }
    }
}
