package mft;

public class Dell extends Laptop {
    private boolean touch;

    public boolean isTouch() {
        return touch;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "touch=" + touch +
                '}';
    }
}
