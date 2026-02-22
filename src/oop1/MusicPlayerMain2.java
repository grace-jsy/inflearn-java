package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // on
        data.isOn = true;
        System.out.println("Music starts");

        // volume up
        data.volume++;
        System.out.println("volume: " + data.volume);
        // volume up
        data.volume++;
        System.out.println("volume: " + data.volume);
        // volume down
        data.volume--;
        System.out.println("volume: " + data.volume);

        // status
        System.out.println("Status");
        if (data.isOn) {
            System.out.println("Music Player is ON, Volume: " + data.volume);
        } else {
            System.out.println("Music Player is OFF");
        }

        // off
        data.isOn = false;
        System.out.println("Music Player is turning off");

    }

}
