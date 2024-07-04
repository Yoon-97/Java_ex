public class iPhone extends Phone {
    @Override
    public void turnOn() {
        System.out.println("잡스님이 애플폰을 켰습니다.");
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }

    @Override
    public void buyPhone() {
        System.out.println("잡스님이 애플폰을 구매하였습니다.");
    }
}

