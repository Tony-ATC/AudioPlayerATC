package be.intecbrussel.AudioPlayer;

public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.contains("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if(audioType.contains("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }  else if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file.Name: " + fileName);
        }  else {
            System.out.println("The file '" + fileName +"' from the audio type '" + audioType + "' is not supported by this media player. Try to convert it to the correct format.");
        }
    }
}
