package AdapterPattern;


//This class will now use the adapter class and will confirm to media player interface
public class AudioPlayer implements MediaPlayer{
    
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType,String fileName) {

        //assuming that the client expectation was to have an interface which plays .mp3 files
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else {
            System.out.println("Invalid media type: " + audioType + " format not supported.");
        }
    }
}
