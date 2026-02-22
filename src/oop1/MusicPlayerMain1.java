package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
         int volume = 0;
         boolean isOn = false;

        // on
        isOn = true;
        System.out.println("Music starts");

        // volume up
        volume++;
        System.out.println("volume: " + volume);
        // volume up
        volume++;
        System.out.println("volume: " + volume);
        // volume down
        volume--;
        System.out.println("volume: " + volume);

        // status
        System.out.println("Status");
        if (isOn) {
            System.out.println("Music Player is ON, Volume: " + volume);
        } else {
            System.out.println("Music Player is OFF");
        }

        // off
        isOn = false;
        System.out.println("Music Player is turning off");

    }
}
