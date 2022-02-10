public class Main {
    public static void main(String[] args) {
        var fan1 = new Fan(3,10,"yellow");
        var fan2 = new Fan(2,5,"blue");
        fan1.on();
        fan2.on();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
