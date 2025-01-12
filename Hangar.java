public class Hangar {
    public static void main(String[] args) {
        Car Delorean = new Car("Delorean", 432000);
        Boat Brigantine = new Boat("Brigantine", 3 );

        System.out.println(Delorean.doStuff());
        System.out.println(Brigantine.doStuff());
    }
}
