package OOP_week1.hometask5;

/**
 * Created by katechebonenko on 1/27/17.
 */
public class Run {

    public static void main(String[] args) {
        Dictionary bk1 = new Dictionary( "Kyiv",  "Dictionary Adresses", 200, "Adresses");
        bk1.showEditionName();
        bk1.showBookName();
        bk1.showBookPages();
        bk1.dictionaryType();

        Encyclopedia enc1 = new Encyclopedia("Kharkov", "Biology Encyclopedia", 300, "Biology");
        enc1.showEditionName();
        enc1.showBookName();
        enc1.showBookPages();
        enc1.encyclopediaType();


    }
}
