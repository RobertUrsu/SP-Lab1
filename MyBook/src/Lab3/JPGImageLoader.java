package Lab3;

public class JPGImageLoader implements ImageLoader{
    @Override
    public ImageContent load(String s) {
        System.out.println("Creating JPG image..");
        return new ImageContent(s);
    }
}
