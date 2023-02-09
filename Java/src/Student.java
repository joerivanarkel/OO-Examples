public class Student 
{
    private String Name;
    private int Age;
    private String Address;
    
    public Student(String name, int age, String address) 
    {
        Name = name;
        Age = age;
        Address = address;
    }

    public String GetName() 
    {
        return Name;
    }

    public int GetAge() 
    {
        return Age;
    }

    public String GetAddress() 
    {
        return Address;
    }

    public String toString() 
    {
        return "(Name=" + Name + ", Age=" + Age + ", Address=" + Address + ")";
    }
}
