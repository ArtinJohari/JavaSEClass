package mft;

public class Asus extends Laptop {
    private String battery;

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Asus{" +
                "battery='" + battery + '\'' +
                '}';
    }
}
