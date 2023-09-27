import java.util.*;

enum days{
    monday,tuesday,wednesday
}

public class enum1 {
    public static void main(String[] args) {
    
        EnumMap<days,String> schedule=new EnumMap<>(days.class);
        schedule.put(days.monday, "free");

        System.out.println(schedule.get(days.monday));

    }
}
