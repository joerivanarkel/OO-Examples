namespace CSharp;

public class Klas 
{
    private List<Student> Students;

    public Klas(List<Student> students)
    {
        Students = new();
    }

    public void AddStudent(Student student)
    {
        Students.Add(student);
    }

    public override string ToString()
    {
        return $"Klas: {string.Join(", ", Students)}";
    }
}