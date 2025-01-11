public class Classroom {
    public static void main(String[] args) {
        Wilder JCVD = new Wilder("Jean-Claude", true);
        Wilder Suzette = new Wilder("Suzette", false);
        System.out.println(JCVD.whoAmI());
        System.out.println(Suzette.whoAmI());
    }
}
