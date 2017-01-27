package OOP_week1.hometask5_2;

/**
 * Created by katechebonenko on 1/27/17.
 */
public class Run {
    //interface Врач <- class Хирург <- class Нейрохирург.
    public static void main(String[] args) {
        Neurosurgeon nr1 = new Neurosurgeon();
        nr1.makeNeuoroOperations();
        nr1.makeOperations();
        nr1.treatment();
    }


}
