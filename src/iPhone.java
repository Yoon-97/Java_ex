public class iPhone extends Phone {
    public iPhone(String brand) {
        super(brand);
    }
    @Override
    public void turnOn() {
        System.out.println("님이 애플폰을 켰습니다.");
        System.out.println("@@@ 폰 켜지는 중 @@@\n");
    }
}

