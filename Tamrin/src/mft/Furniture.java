package mft;

public class Furniture extends NonElectric {
    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "seats=" + seats +
                '}';
    }
}
