import java.util.HashMap;
import java.util.Map;

public class hash1 {
    public static void main(String[] args) {
        // initial capcity=16 and load factor=0.75
        HashMap<String,Integer> map=new HashMap<>();

        // initial capacity=5 and load factor=0.75
        HashMap<String,Integer> map1=new HashMap<>(5);
        
        // HashMap<K, V> hm = new HashMap<K, V>(Map map);

        //[ The default load factor for HashMap is 0.75, which means that 
        // the hash table will be resized when the number of elements 
        // reaches 75% of the current capacity ]

        map.put("Monday", 1);
        map.put("Tuesday", 2);
        map.put("Wednesday", 3);
        map.put("Thursday", 4);

        hash1 obj=new hash1();
        obj.implementation(map);
        
    }
    
    public void implementation(HashMap<String,Integer> map)
    {
        System.out.println(map.keySet());
        System.out.println(map.values());

        // for traversal Entery< , > is required....
        for(Map.Entry<String,Integer> e: map.entrySet())
        {
            System.out.println("key :"+e.getKey());
            
        }

        String[] words={"cd","ac","dc","ca","zz"};
        HashMap<String,Integer> mp=new HashMap<>();

        for(String s:words)
        {
            String rev=new StringBuilder(s).reverse().toString();

            if(mp.containsKey(rev))
            {
                mp.put(rev, mp.get(rev)+1);
            }
            else
            {
                mp.put(s,0);
            }
        }
        // add all values of map
        int icnt=0;
        for(Integer value:mp.values())
        {
            icnt+=value;
        }
        System.out.println(icnt);

        
    }
}
