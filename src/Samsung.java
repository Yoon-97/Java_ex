public class Samsung extends Phone {
    public Samsung() {
        super();
    }

    @Override
    public void turnOn() {
        System.out.println("재용님이 삼송폰을 켰습니다.");
        System.out.println("*** 폰 켜지는 중 ***");
    }

    @Override
    public void buyPhone() {
        System.out.println("재용님이 삼송폰을 구매하였습니다.");
    }
}
