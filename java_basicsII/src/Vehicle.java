public abstract class Vehicle {
    abstract Integer weight();
    abstract String make();
    abstract String model;
    abstract  Integer year;

    public static final class Truck extends Vehicle{
        Float height;

    }

    public static final class CAr extends Vehicle{

    }
}
