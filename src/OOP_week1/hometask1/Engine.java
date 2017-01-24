package OOP_week1.hometask1;

import javafx.beans.property.SimpleFloatProperty;

/**
 * Created by katechebonenko on 1/23/17.
 */
public class Engine {

    private int speed;
    private int petrol;

    public Engine(int speed, int petrol){
        this.speed = speed;
        this.petrol = petrol;
    }

    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public int getPetrol(){
        return petrol;
    }

    public void setPetrol(int petrol){
//        validation
        this.petrol = petrol;
    }

    public String driveCar(){
        return String.format("Cars can be driven with speed - %d and max petrol level is - %d" , speed, petrol);
    }




}
