public class User {
    private String name;
    private String id;
    private String pw;
    private Phone phone;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPw() {
        return pw;
    }

    public User(String id, String pw, String name) {
        this.name = name;
        this.id = id;
        this.pw = pw;
    }

    public void buyPhone(Phone phone) {
        this.phone = phone;
        System.out.println(name + "님이 " + this.phone.getBrand() + "을 구매하였습니다");
    }

    ;

    public void turnOnPhone() {
        System.out.print(name);
        phone.turnOn();
    }

    ;
}

