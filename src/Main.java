
public class Main {
    public static void main(String[] args) {
        iPhone iphoneMax = new iPhone();
        iphoneMax.buyPhone();
        iphoneMax.turnOn();

        System.out.println();

        Samsung galaxy = new Samsung();
        galaxy.buyPhone();
        galaxy.turnOn();


    }
}