public class ImageFile implements  DisplayObject {
    private BufferedImage bufferedImage;

    public ImageFile() {
        bufferedImage = new BufferedImage("newimage");
    }

    @Override
    public void display() {
        System.out.println(bufferedImage.getName());
    }

    public BufferedImage load() {
        return bufferedImage;
    }
}
