package OOP_week1.hometask1;

/**
 * Created by katechebonenko on 1/23/17.
 */
public class Run {
    /*
    1. Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
Методы: ехать, заправляться, менять колесо, вывести на консоль марку ав-
томобиля.
     */

    public static void main(String[] args) {

        Wheel wheel1 = new Wheel("BBS", 14);
        Wheel wheel2 = new Wheel ("Michelin", 14);

        Wheel [] wheels = {wheel1, wheel2};


        Engine engine1 = new Engine (250,50);


        Car car = new Car ("BMW", wheels, engine1);
        car.carModel();
        car.showWheels();
        car.showEngine();




    }
}
