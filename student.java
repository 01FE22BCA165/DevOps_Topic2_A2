import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class student {
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age +"years");
    }
    
    public static void main(String[] args) {
        studentcourseinfo s = new studentcourseinfo();
        s.name = "Aishwarya Koppad";
        s.displayName();
        s.displayAge("03-10-2003");
        s.displayStudentMarks();
        s.totalStudentMarks();
}
}