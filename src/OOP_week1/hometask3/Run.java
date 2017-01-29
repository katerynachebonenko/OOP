package OOP_week1.hometask3;

/**
 * Created by katechebonenko on 1/24/17.
 */
public class Run {

    /*
    3. Закончить начатое в классе задание "Студент". Дописать метод добавить/удалить студента/группу.
Для работы с массивом использовать метод System.arrayCopy
Добавить методы в класс Группа:
   - поиск студента по имени
   - сортировка студентов по имени
     */

    public static void main(String[] args) {
        Student student = new Student("John", "Smith", 35);
        Student student2 = new Student("Jack", "Smith", 25);
        Student student3 = new Student("Sara", "Smith", 15);
        Student student4 = new Student("Ann", "Smith", 45);
        Student student5 = new Student("Mike", "Smith", 55);
        Student student6 = new Student("Bill", "Smith", 17);
        Student student7 = new Student("Kate", "Smith", 23);
        Student student8 = new Student("Bob", "Smith", 33);

        Student[] students = {student, student2};
        Student[] students2 = {student3, student4, student5};
        Student[] students3 = {student6, student7};

        Group group = new Group("ACO17", students);
        Group group2 = new Group("ACO18", students2);
        Group group3 = new Group("ACO19", students2);
        Group group4 = new Group("ACO30", students3);

        Group[] groups = {group, group2};
        Group[] groups2 = {group2, group3};
        Group[] groups3 = {group, group3};
        Group[] groups4 = {group3, group4};
        Group[] groups5 = {group, group2};


        University university = new University("KNU", groups);
        University university2 = new University("KPI", groups2);

        System.out.println("Groups:");
        university.showGroups();
        System.out.println("Students:");
        university.showStudents();
        System.out.println("-------------------");
        //add student, override equals!
        group.addStudent(student2);
        group.sortStudents(student2);
        group.showStudents();
        System.out.println("-------------------");
        //remove student
        group2.removeStudent(student4);
        group2.sortStudents(student4);
        group2.showStudents();
        System.out.println("-------------------");
        //add group, check equals
        university.addGroup(group2);
        university.showGroups();
        System.out.println("-------------------");
        //remove group
        university2.removeGroup(group2);
        university2.showGroups();
        System.out.println("-------------------");

        //search stud by name
        Student searchable = group4.searchStudentName("Bill");
        System.out.println(searchable.asString());
        System.out.println("-------------------");


    }
}
