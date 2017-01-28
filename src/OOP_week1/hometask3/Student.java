package OOP_week1.hometask3;

/**
 * Created by katechebonenko on 1/24/17.
 */
public class Student {
    private String name;
    private String surname;
    private int age;
    private double averageMark;


    public Student(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
//        validation
        if(name == null || name.isEmpty()) return;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }


    public String asString(){
        return String.format("Student name - %s, age - %d", name, age);
    }
}
