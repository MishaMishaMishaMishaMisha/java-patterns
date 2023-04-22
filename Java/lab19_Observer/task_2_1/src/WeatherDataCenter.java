public class WeatherDataCenter {

    final private WeatherReader weatherReader;

    public WeatherDataCenter() {
        weatherReader = new WeatherReader("C:\\Users\\Misha\\IdeaProjects\\design-patterns-java\\Java\\lab19_Observer\\task_2_1\\resources\\input01.txt");
    }

    public boolean update() {
        WeatherEvent weatherEvent = weatherReader.getEvent();
        if (weatherEvent == null){
            return false;
        }

        if (weatherEvent.getLocation().equals("end")){
            return true;
        }

        System.out.println("Update data: city: " + weatherEvent.getLocation()
                + ", temperature = " + weatherEvent.getTemperature()
                + ", humidity = " + weatherEvent.getHumidity()
                + ", pressure = " + weatherEvent.getPressure());

        return false;
    }
}