public class ImageFileProxy implements DisplayObject {

    private DisplayObject imageFile;
    final private String path;

    public ImageFileProxy(String path) {
        this.path = path;
    }
    @Override
    public void display() {
        if (imageFile == null) {
            imageFile = new ImageFile(path);
        }
        imageFile.display();
    }

}
