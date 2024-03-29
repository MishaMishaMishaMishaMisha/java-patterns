public class ComponentA implements Component {

    public ComponentA(String id) {
        this.id = id;
    }

    private Mediator mediator;

    private final String id;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getId() {
        return id;
    }

    @Override
    public void broadcastMessage(String message) {
        if (mediator != null){
            mediator.broadcast(this, message);
        }
    }

    @Override
    public void handleMessage(Component componentFrom, String message) {
        String from = "";
        if (componentFrom instanceof ComponentA){
            ComponentA concreteComponent = (ComponentA) componentFrom;
            from = concreteComponent.getId();
        }

        System.out.printf("Component %s: Message '%s' received from Component '%s'\n", id, message, from);
    }
}