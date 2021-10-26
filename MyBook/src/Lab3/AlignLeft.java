package Lab3;

public class AlignLeft implements AlignStrategy{
    public void render (Paragraph p ,Context c) {
        System.out.println("Paragraph "+ p.getName()+ " alignLeft");
    }
}
