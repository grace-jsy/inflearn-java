package access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("Max");
        } else {
            volume += 10;
            System.out.println("10 volume up");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("Volume down");
    }

    void showVolume() {
        System.out.println("Current Volume: " + volume);
    }
}
