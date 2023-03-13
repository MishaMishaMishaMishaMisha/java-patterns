public class ImageButton extends Button {

    public ImageButton(SizeButton sizeButton) {
        super(sizeButton);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a image button.\n");
    }

}
