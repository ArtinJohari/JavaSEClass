package mft;

public class Mobile extends Electric {
    private int ScreenSize;

    public int getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(int screenSize) {
        ScreenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "ScreenSize=" + ScreenSize +
                '}';
    }
}
