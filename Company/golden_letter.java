// we have gievn key(string) contains golden letters & string str
// count the no. of golden letters in key in str 
import java.util.HashSet;
import java.util.Scanner;

public class golden_letter {
     public static void main(String[] args) {
        Scanner sobj=new Scanner(System.in);
        
        String key="";
        System.out.println("Enter key(golden letters):");
        key=sobj.nextLine();

        String str="";
        System.out.println("Enter str:");
        str=sobj.nextLine();            
        /////////////////////////////

        // convert string into array of character
        // O(n^2)
        int icnt=0;

        for(int i=0;i<str.length();i++)
        {
         for(int j=0;j<key.length();j++)
         {
            if(str.charAt(i)==key.charAt(j))
            {
                icnt++;
            }
         }
        }
        System.out.println("golden letters in string 'str':"+icnt);

        // ///////////////////////////
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<key.length();i++)
        {
            set.add(key.charAt(i));
        }

        int count=0;
        for(int i=0;i<str.length();i++)
        {
           if(set.contains((str.charAt(i))))
           {
            count++;
           }
        }
        System.out.println("goldent letters :"+count);

    }
}
