package OOP_week1.hometask5;

/**
 * Created by katechebonenko on 1/27/17.
 */
public abstract class Book implements Edition {

    String name;
    int pages;
    public String editionName;

    public Book (String editionName, String name, int pages){
        this.editionName = editionName;
        this.name = name;
        this.pages = pages;
    }


    public void showBookName(){
        System.out.println("Your book name is " + name);
    }

    public void showBookPages (){
        System.out.println("Your book has  " + pages + " pages");
    }

    public void showEditionName(){
        System.out.println("Edition name is " + editionName);
    }


}
