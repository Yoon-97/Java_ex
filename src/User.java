public class User {
    private String name;
    private Phone phone;

    public String getName() {
        return name;
    }

    public User(String name) {this.name = name;}

    public void buyPhone(Phone phone){
        this.phone = phone;
        System.out.println(name+"님이 "+ this.phone.getBrand() +"을 구매하였습니다");
    };
    public void turnOnPhone(){
        System.out.print(name);
        phone.turnOn();
    };
}

