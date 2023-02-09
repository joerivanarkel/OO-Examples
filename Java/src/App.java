public class App {
    public static void main(String[] args) throws Exception {
        Klas klas = new Klas();
        klas.AddStudent(new Student("Jan", 18, "Kerkstraat 1"));
        klas.AddStudent(new Student("Piet", 19, "Kerkstraat 2"));
        klas.AddStudent(new Student("Klaas", 20, "Kerkstraat 3"));

        System.out.println(klas);
    }
}
