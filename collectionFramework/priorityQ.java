

import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQ {
    
public static void main(String[] args) {

    // if we want maxHeap implementation we can use 'comparator.reverseOrder()'
    PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.naturalOrder());
    PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());

    //Queue<Integer> pq=new PriorityQueue<>();
 //    we can also use Queue (see Queue program)
 
    pq.add(10);
    pq.add(50);
    pq.add(30);
    pq.add(60);


    while(!pq.isEmpty())//this will return elements according to minHeap
    {
        System.out.println(pq.remove());
    }

System.out.println("Reverse order");
    /////////////////////////////////////////////////////

    pq1.add(10);
    pq1.add(50);
    pq1.add(30);
    pq1.add(60);


    while(!pq1.isEmpty())//this will return elements according to maxHeap
    {
        System.out.println(pq1.remove());
    }
}

}
