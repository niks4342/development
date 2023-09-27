import java.util.*;

public class studentHash {
    public static void main(String[] args) {
        
        Set<student> st=new HashSet<>(0);

        st.add(new student("Nikita", 9));
        st.add(new student("Gargi", 91));
        st.add(new student("Gauri", 97));
        st.add(new student("Nikita", 9));
        // we can use equals

        System.out.println(st);
    }
}
