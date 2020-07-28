import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();

        for (int i = 0; i < 1000; i++) {
            studentRepository.saveStudent(new Student(UUID.randomUUID().toString(), i));
        }

        System.out.println(studentRepository.getAllStudents().size());

        System.out.println(studentRepository.getStudentById(400).getName());

        System.out.println(studentRepository.removeStudentById(360));
    }
}
