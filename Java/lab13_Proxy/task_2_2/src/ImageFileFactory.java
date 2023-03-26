class ImageFileFactory {

    public DisplayObject createImage(String path) {
        return new ImageFileProxy(path);
    }

}