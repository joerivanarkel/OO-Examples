using CSharp;

var student = new Student("John", 20, "123 Main Street");
var student2 = new Student("Jane", 21, "456 Main Street");

var klas = new Klas(new List<Student> { student, student2 });
klas.AddStudent(new Student("Jan", 18, "Kerkstraat 1"));
klas.AddStudent(new Student("Piet", 19, "Kerkstraat 2"));
klas.AddStudent(new Student("Klaas", 20, "Kerkstraat 3"));

Console.WriteLine(klas);