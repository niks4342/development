
// import java.util.*;
// public class arrayList {
//     public static void main(String[] args) {
        
//         // we can use any datatype e.g Integer , Character
//         ArrayList<String> list=new ArrayList<>();
//         // add elements at the end of list   //O(n)
//         list.add("apple");
//         list.add("banana");
//         list.add("chiku");
//         list.add("graps");
//         list.add("custard apple");
//         // methof overloading
//         list.add(6,"Nikita");


//         // get()
//         System.out.println(list.get(0));

//         // size()
//         System.out.println("size is:"+list.size());

//         //isEmpty()
//         System.out.println(list.isEmpty()); 

//         // remove()
//         list.remove(2);//O(n)
//         // list.clear()   -----> remove all elements

//         System.out.println("size is:"+list.size());
//         // traverse an ArrayList

//         for(int i=0;i<list.size();i++)
//         {
//             String str=list.get(i);
//             System.out.println(str);
//         }


//     }
// }


class arrayList {

    public static void main(String[] args) {
        arrayList obj=new arrayList();

        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        int ret=obj.maxSubArray(arr);
        System.out.println(ret);
    }

    public int maxSubArray(int[] nums) {
        System.out.println("in fun");
        int max=nums[0];
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int temp=0;
            for(int j=i;j<n;j++)
            {
                temp=temp+nums[j];
                

                if(temp>max)
                {
                    max=temp;
                }
            }
        }

        return max;
    }
}