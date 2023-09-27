
import java.util.*;

public class hashset {
    public static void main(String[] args) {
        
        HashSet<Integer> hs=new HashSet<>();

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
