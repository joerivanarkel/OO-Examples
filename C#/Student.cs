namespace CSharp;

public class Student
{
    public string Name { get; }
    public int Age { get; }
    public string Address { get; }

    public Student(string name, int age, string address)
    {
        Name = name;
        Age = age;
        Address = address;
    }

    public override string ToString()
    {
        return $"(Naam: {Name}, Leeftijd: {Age}, Adres: {Address})";
    }
}