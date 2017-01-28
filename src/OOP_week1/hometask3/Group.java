package OOP_week1.hometask3;

/**
 * Created by katechebonenko on 1/24/17.
 */
public class Group {
    private String name;
    private Student[] students;

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public void showStudents() {
        for (Student student : students) {
            System.out.println(student.asString());
        }
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        //check if student exists in students
        boolean exists = false;
        for (int i = 0; i < students.length; i++) {
            if (student == students[i]) {
                exists = true;
                System.out.println("Student exists in list");
                break;
            }
        }

        //if not exists add him
        if (exists == false) {
            Student[] array = new Student[students.length + 1];
            System.arraycopy(students, 0, array, 0, students.length);
            array[array.length - 1] = student;

            students = array;
        }

    }

    public void removeStudent(Student student) {
        //new array size = stud.length-1
        Student[] updatedStudents = new Student[students.length - 1];
        boolean foundStudent = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == student) {
                foundStudent = true;

            } else {
                //write to new array
                if (foundStudent == false) {
                    updatedStudents[i] = students[i];
                } else {
                    updatedStudents[i - 1] = students[i];
                }

            }

        }

    }

    public Student searchStudentName(String searchablename) {

        for (int i = 0; i < students.length; i++) {
            if (students[i].getName() == searchablename) {
                return students[i];
            }


        }
        return null;
    }

    public void sortStudents(Student student) {
        for (int j = 0; j < students.length; j++) {
            for (int i = 0; i < students.length - 1; i++) {
                int res = students[i].getName().compareTo(students[i + 1].getName());
                if (res > 0) {
                    Student tmp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = tmp;
                }
            }
        }

    }
}
