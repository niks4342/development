

import java.util.*;

public class linkedHash {
    public static void main(String[] args) {
        
        // Set<Integer> hs=new LinkedHashSet<>();
        Set<Integer> hs=new TreeSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(13);
        hs.add(32);
        hs.add(80);
        hs.add(45);

        for(Integer element:hs)
        {
            System.out.println(element);
        }
    }
}
