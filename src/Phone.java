import java.util.Objects;

public abstract class Phone {
    private String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void turnOn();
}

