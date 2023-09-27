import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        
        ArrayDeque<Integer> ad=new ArrayDeque<>();

        ad.offer(10);
        ad.offerFirst(12);
        ad.offerLast(30);

        System.out.println(ad);

        System.out.println("first"+ad.peekFirst());
        System.out.println("last:"+ad.peekLast());

        ad.pollFirst();
        System.out.println(ad);
    }
}
