package AdapterPattern;

//This is the target interface, need to bridge the incompatible classes to this interface
public interface MediaPlayer {
    public void play(String audioType,String fileName);
}
