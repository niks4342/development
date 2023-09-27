// 
import java.util.*;
public class queue {
    public static void main(String[] args) {
        
// queue is interface implemented in LinkedList,ArrayDeque(double ended Q),PriorityQueue

        Queue<String> q=new LinkedList<>();
        
        // add elemns to queue
        // (if Queue is full add() thorwn an Exception)
        q.add("apple");
        q.add("banana");
        q.add("mango");
        q.add("lemon");

        // (if Queue is full offer() returns False)
        q.offer("orange");

        

        // remove the ele in the front of the Queue(similar to peek)
        q.poll();// or q.peek()


        // for-each
        for(String element:q)
        {
            System.out.println(element);
        }

        System.out.println("----------  for loop  -------");
        // 
        for(int i=0;i<q.size();i++)
        {
            String ele=q.remove();
            System.out.println(ele);
            // again add element to Q as it become empty
            q.add(ele);
        }


    }
}
