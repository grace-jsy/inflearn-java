package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // on
        on(data);

        // volume up
        volumeUp(data);
        // volume up
        volumeUp(data);
        // volume down
        volumeDown(data);

        // status
        showStatus(data);


        // off
        off(data);
    }

        static void on(MusicPlayerData data) {
            data.isOn = true;
            System.out.println("Music starts");
        }

        static void off(MusicPlayerData data) {
            data.isOn = false;
            System.out.println("Music Player is turning off");
        }

        static void volumeUp(MusicPlayerData data) {
            data.volume++;
            System.out.println("volume: " + data.volume);
        }

         static void volumeDown(MusicPlayerData data) {
             data.volume--;
             System.out.println("volume: " + data.volume);
        }

         static void showStatus(MusicPlayerData data) {
             System.out.println("Status");
             if (data.isOn) {
                 System.out.println("Music Player is ON, Volume: " + data.volume);
             } else {
                 System.out.println("Music Player is OFF");
             }
         }

}
