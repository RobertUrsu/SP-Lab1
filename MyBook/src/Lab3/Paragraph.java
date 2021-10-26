package Lab3;


public class Paragraph implements Element {
    private String text;
    private AlignStrategy alignStrategy;

    public Paragraph(String text) {
        this.text = text;
    }
    public void print(){
        if (alignStrategy != null) {
        alignStrategy.render(this,null);
        }
        else {
            System.out.println("Paragraph: " + text);
        }

    }

    public void setAlignStrategy(AlignStrategy alignStrategy) {
        this.alignStrategy = alignStrategy;
    }

    @Override
    public void add(Element e) {
        // TODO Auto-generated method stub
        // nu e nevoie sa le implementam ca astea sunt frunze
    }
    @Override
    public Element get(int poz) {
        // TODO Auto-generated method stub
        // nu e nevoie sa le implementam ca astea sunt frunze
        return null;
    }
    @Override
    public void remove(Element e) {
        // TODO Auto-generated method stub
        // nu e nevoie sa le implementam ca astea sunt frunze
    }
    @Override
    public boolean find(Element e) {
        // TODO Auto-generated method stub
        if (!(e instanceof Paragraph)) {
            return false;
        }
        else {
            return ((Paragraph) e).text.equals(this.text);
        }
    }
    public String getName() {
        return this.text;
    }
}