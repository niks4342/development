

public class student {
    String name;
    int roll_no;

    public student(String name,int roll_no)
    {
        this.name=name;
        this.roll_no=roll_no;
    }

    // toString method returns String representation of obje
    // if we don't use this it will return obj only

    @Override
    public String toString()
    {
        return "Name :"+name+"Roll_no :"+roll_no;
    }

    @Override 
    public boolean equals(Object obj)
    {
        if(obj instanceof student)
        {
            student other=(student) obj;
            return this.roll_no==other.roll_no;
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        return Integer.hashCode(this.roll_no);
    }
}
