package OOP_week1.hometask5;

/**
 * Created by katechebonenko on 1/27/17.
 */
public class Encyclopedia extends Book {

    private String typeEncyclopedia;

    public Encyclopedia(String editionName, String name, int pages, String typeEncyclopedia) {
        super(editionName, name, pages);
        this.typeEncyclopedia = typeEncyclopedia;
    }


    public String getTypeEncyclopedia(){
        return typeEncyclopedia;
    }

    public void setTypeEncyclopedia(String typeEncyclopedia){
        if (typeEncyclopedia == null || typeEncyclopedia.isEmpty()) return;
        this.typeEncyclopedia = typeEncyclopedia;
    }

    public void encyclopediaType(){
        System.out.print("Your Encyclopedia type is " + typeEncyclopedia);
    }


}
