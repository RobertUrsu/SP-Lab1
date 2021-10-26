package Lab3;

public class BMPImageLoader implements ImageLoader{
    @Override
    public ImageContent load(String s) {
        System.out.println("Creating BMP image..");
        return new ImageContent(s);
    }
}
