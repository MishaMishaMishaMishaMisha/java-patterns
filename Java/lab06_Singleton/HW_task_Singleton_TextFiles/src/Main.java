public class Main {
    public static void main(String[] args) throws Exception {

        String path = "C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab06_Singleton\\HW_task_Singleton_TextFiles\\src\\testFile.txt";
        TextFileEditor textFileEditor = TextFileEditor.getInstance();

        textFileEditor.setFile(path);

        textFileEditor.ReadFile();
        System.out.println();

        textFileEditor.WriteLine("New Line 123");
        textFileEditor.ReadFile();
        System.out.println();

        textFileEditor.DeleteLine(2);
        textFileEditor.ReadFile();

    }
}