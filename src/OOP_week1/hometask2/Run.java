package OOP_week1.hometask2;

/**
 * Created by katechebonenko on 1/24/17.
 */
public class Run {
    /*
    2. Создать объект класса Щенок, используя классы Животное, Собака.
Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.
     */
    public static void main(String[] args) {


        Puppy puppy1 = new Puppy("Tasya");
        puppy1.showName();
        puppy1.Voice();
        puppy1.dogAnimal();
        puppy1.animalRun();
        puppy1.animalJump();

    }


}
