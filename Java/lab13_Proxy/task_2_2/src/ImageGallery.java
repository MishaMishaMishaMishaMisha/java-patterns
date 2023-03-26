public class ImageGallery {

    public static void main(String[] args) {

        ImageFileFactory factory = new ImageFileFactory();

        DisplayObject[] images = {
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image1.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image2.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image3.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image4.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image5.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image6.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image7.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image8.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image9.jpeg"),
                factory.createImage("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab13_Proxy\\task_2_2\\resources\\image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }

}
