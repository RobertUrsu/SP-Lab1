import java.util.ArrayList;
import java.util.List;

public class Book {
    public String name;
    public List<String> paragrafe;
    public List<String> imagini;
    public List<String> tabele;

    public void createNewParagraph(String paragraf){
        paragrafe.add(paragraf);
    }
    public void createNewImage(String imagine){
        imagini.add(imagine);
    }
    public void createNewTable(String tabel){
        tabele.add(tabel);
    }

    public Book(String name) {
        this.name = name;
        this.paragrafe = new ArrayList<>();
        this.tabele = new ArrayList<>();
        this.imagini = new ArrayList<>();

    }

    public void print(){
        System.out.println(paragrafe);
        System.out.println(imagini);
        System.out.println(tabele);

    }
}
