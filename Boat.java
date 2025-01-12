public class Boat extends Vehicle {
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "I am " + this.getBrand() + " and I say : SAIL (toodoodoodoo doo too-toodoo)";
    }
}
