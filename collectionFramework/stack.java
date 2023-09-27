import java.util.*;
////////////////////////////////////////////////
// *******  Theory  ***********

// 1. stack is synchronized i.e thread safe
// 2. stack have limited capacity is it is exceed it's capacity 
// 'StackOverflowError' will be generate

public class stack {
    public static void main(String[] args) {
       
        Stack<String> st=new Stack<>();

        // add elemnts at the top of the stack
        st.push("apple");
        st.push("banana");
        st.push("custared apple");
        st.push("mango");

        // give an elemnt at the  'top'
        System.out.println("elemnts at top:"+st.peek());

        // remove the elements from top
        st.pop();
        System.out.println("elemnts at top:"+st.peek());

        // Check if stack is empty
        System.out.println("empty ? :"+st.isEmpty());
        System.out.println("empty ? :"+st.empty());


        // for loop is not allow because random access is not possible 
        // and for loop allowa random access using index
        for(String element:st)
        {
            System.out.println(element);
        }


    }
}
