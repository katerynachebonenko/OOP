package OOP_week1.hometask2;

/**
 * Created by katechebonenko on 1/24/17.
 */
public class Puppy extends Dog {

    private String name;

    public Puppy(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) return;
        this.name = name;
    }

    public void showName() {
        System.out.println("Your puppy name is  " + name);
    }
}
