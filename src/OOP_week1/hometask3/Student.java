package OOP_week1.hometask3;

/**
 * Created by katechebonenko on 1/24/17.
 */
public class Student {
    private String name;
    private String surname;
    private int age;



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


    public String asString(){
        return String.format("Student name - %s, age - %d", name, age);
    }


      /*
    В классе "Студент" и "Группа" переопределить методы equals()  и модефицировать методы add в классах "Группа" и "Университет"
    таким образом, что бы было невозможно добавить одного и тогоже студента/группу 2 раза (использовать метод equals).
     */

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
        result = prime * result + surname.hashCode();
        result = prime * result + age;
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
        Student other = (Student) obj;
        if (name != other.name)
            return false;
        if (surname != other.surname)
            return false;
        if (age != other.age)
            return false;
        return true;
    }



}
