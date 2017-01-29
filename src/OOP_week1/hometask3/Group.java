package OOP_week1.hometask3;
import java.util.Comparator;
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
            //Equals!
            if (students[i].equals(student)) {
                exists = true;
              //  System.out.println("Student exists in list");
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
            if (students[i].getName().equals(searchablename)) {
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


    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;

        /*
        private String name;
    private String surname;
    private int age;
         */
        result = prime * result + name.hashCode();
        result = prime * result + students.hashCode();
        return result;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Group other = (Group) obj;
        if (name != other.name)
            return false;
        if (students != other.students)
            return false;
        return true;
    }


    /*

    В классе "Студент" и "Группа" переопределить методы equals()  и модефицировать методы add в классах "Группа" и "Университет"
    таким образом, что бы было невозможно добавить одного и тогоже студента/группу 2 раза (использовать метод equals).
     */




/*

    public void sortByName (Comparator comparator){
        for (int j = 0; j < students.length; j++) {
            for (int i = 0; i < students.length - 1; i++) {
               if (comparator.compare(students[i].getSurname(), Student students[i+1])<0 {
                    Student tmp = students[i];
                    students[i] = students[i + 1];
                    students[i + 1] = tmp;
                }
            }
        }





    }
    */
}
