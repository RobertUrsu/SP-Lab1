package Lab3;

public class AlignCenter implements AlignStrategy{
    public void render (Paragraph p ,Context c) {
        System.out.println("Paragraph "+ p.getName()+ " alignCenter");
    }
}
