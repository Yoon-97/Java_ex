
public class Main {
    public static void main(String[] args) {
        iPhone iPhone = new iPhone("아이폰");
        Samsung galaxy = new Samsung("삼송폰");

        User jobs = new User("잡스");
        jobs.buyPhone(iPhone);
        jobs.turnOnPhone();

        User jDragon = new User("재용");
        jDragon.buyPhone(galaxy);
        jDragon.turnOnPhone();


    }
}