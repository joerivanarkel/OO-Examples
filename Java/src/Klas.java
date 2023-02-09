import java.util.ArrayList;
import java.util.List;

public class Klas 
{
    private List<Student> Students;

    public Klas() 
    {
        Students = new ArrayList<Student>();
    }

    public void AddStudent(Student student) 
    {
        Students.add(student);
    }

    public String toString() 
    {
        return "Klas: " + Students + "";
    }
}
