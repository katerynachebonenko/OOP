package OOP_week1.hometask5;

/**
 * Created by katechebonenko on 1/27/17.
 */
public class Dictionary extends Book {


  private String typeDictionary;

    public Dictionary(String editionName, String name, int pages, String typeDictionary) {
        super(editionName, name, pages);
        this.typeDictionary = typeDictionary;
    }


    public String getTypeDictionary(){
        return typeDictionary;
    }

    public void setTypeDictionary(String typeDictionary){
        if (typeDictionary == null || typeDictionary.isEmpty()) return;
        this.typeDictionary = typeDictionary;
    }

    public void dictionaryType(){
        System.out.println("Your Dictionary type is " + typeDictionary);
    }


    @Override
    public void editionName() {

    }
}
