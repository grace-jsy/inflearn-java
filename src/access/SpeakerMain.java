package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        // access a field directly
        System.out.println("Edit Volume field");
        // speaker.volume = 200;
        speaker.showVolume();
    }
}
