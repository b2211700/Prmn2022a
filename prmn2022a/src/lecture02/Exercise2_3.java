package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tire = new Tire[4];
        Engine engine = new Engine(400);

        Car car = new Car((Tire[]) tire, (Engine) engine);

        GasStation gasStation = new GasStation();
        gasStation.refuel((Car) car);

        car.startEngine();
        car.run();
    }
}
