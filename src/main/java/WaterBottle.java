public class WaterBottle {

    private int volume;

    public WaterBottle() {
        this.volume = 100;
    }

    public void drink() {
        int volume = this.volume;
        this.volume = volume - 10;
    }

    public int getVolume() {
        return volume;
    }

    public void empty() {
        this.volume = 0;
    }

    public void fill() {
        this.volume = 100;
    }
}
