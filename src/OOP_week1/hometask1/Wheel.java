package OOP_week1.hometask1;

/**
 * Created by katechebonenko on 1/23/17.
 */
public class Wheel {

    private String wheelProducer;
    private int wheelDiametr;


    public Wheel(String wheelProducer, int wheelDiametr){
        this.wheelProducer = wheelProducer;
        this.wheelDiametr = wheelDiametr;
    }

    public String getWheelProducer(){
        return wheelProducer;
    }

    public void setWheelProducer(String wheelProducer){
//        validation
        if(wheelProducer == null || wheelProducer.isEmpty()) return;
        this.wheelProducer = wheelProducer;
    }

    public float getWheelDiametr(){
        return wheelDiametr;
    }

    public void setWheelDiametr(int wheelDiametr){
//        validation
        this.wheelDiametr = wheelDiametr;
    }

    public String changeWheel(){
        return String.format("Wheel Producer - %s, Wheel Diametr - %d", wheelProducer, wheelDiametr);
    }

}
