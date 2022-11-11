package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {
        Tire[] tire = new Tire[4];
        Engine engine = new Engine(400);

        Car car = new Car((Tire[]) tire, (Engine) engine);
        //Car car = new Car();
        GasStation gasstation = new GasStation();

        car.run();
        gasstation.refuel((Car) car);
        car.run();

    }
}
