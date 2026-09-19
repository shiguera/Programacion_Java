public class Main {
    public static void main(String[] args) {
        Router router1 = new Router("R-01", "192.168.1.1", "activo", 2);
        Router router2 = new Router("R-01", "192.168.1.1", "activo", 2);
        Switch switch1 = new Switch("S-01", "192.168.1.2", "activo", 24);

        System.out.println(router1);
        System.out.println(switch1);

        System.out.println("router1.equals(router2): " + router1.equals(router2));
        System.out.println("router1.equals(switch1): " + router1.equals(switch1));
    }
}
