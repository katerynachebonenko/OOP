package OOP_week1.hometask1;

/**
 * Created by katechebonenko on 1/23/17.
 */
public class Car {
    private String carModel;
    private Wheel[] wheels;
    private Engine engine;

    public Car(String carModel, Wheel[] wheels, Engine engine) {
        this.carModel = carModel;
        this.wheels = wheels;
        this.engine = engine;
    }

    public void carModel() {
        System.out.println("Car model is " + carModel);
    }

    public void showWheels()
    {
        for (Wheel wheel : wheels) {
            System.out.println(wheel.changeWheel());
        }
    }

    public void showEngine(){
        System.out.println(engine.driveCar());
    }




}
