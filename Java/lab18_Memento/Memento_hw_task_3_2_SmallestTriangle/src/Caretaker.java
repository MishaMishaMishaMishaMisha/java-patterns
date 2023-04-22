import java.util.Stack;

public class Caretaker {

    private final Triangle triangle;
    private final Stack<Triangle.Memento> history = new Stack<>();

    public Caretaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void save(){
        final Triangle.Memento memento = triangle.save();
        history.push(memento);
    }

    public void undo(){
        if (history.empty()){
            return;
        }

        final Triangle.Memento memento = history.pop();
        triangle.restore(memento);
    }

}