package AdapterPattern;

public class AdapterPatternMain {
    
    public static void main(String args[]) {

        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Song_1");
        audioPlayer.play("mp4","Song_2");
        audioPlayer.play("vlc","Song_3");
        audioPlayer.play("wav","Song_4");
    }
}
