package AdapterPattern;

//This is the incompatible interface which needs to adapt to the target interface
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
