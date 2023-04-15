public class Client {

    public static void main(String[] args) {

        ComponentA[] components = {
                new ComponentA("Comp1"),
                new ComponentA("Comp2"),
                new ComponentA("Comp3"),
                new ComponentA("Comp4"),
        };

        ConcreteMediator mediator = new ConcreteMediator();

        for (ComponentA component : components) {
            component.setMediator(mediator);
            mediator.addComponent(component);
        }

        Component component3 = components[2];

        component3.broadcastMessage("Hello!");

    }

}
