public class Main {

  public static void main(String[] args) {
    Plane plane1 = new Plane(123);
    Plane plane2 = new Plane(124);
    Plane plane3 = new Plane(1245);

    ConcreteMediator mediator = new ConcreteMediator();
    plane1.setMediator(mediator);
    plane2.setMediator(mediator);
    plane3.setMediator(mediator);
    mediator.addPlane(plane1);
    mediator.addPlane(plane2);
    mediator.addPlane(plane3);

    plane1.takeOff();
    plane3.takeOff();

    plane3.sendMessage("Hello planes!");

  }

}