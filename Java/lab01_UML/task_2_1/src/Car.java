public class Car implements Vehicle {
    @Override
    public String runTask() {
        return "running";
    }

    @Override
    public String getType() {
        return "car";
    }
}
