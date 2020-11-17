package be.intecbrussel.AudioPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {
    private String fileNme;

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file.Name: " + fileName);
    }
    @Override
    public void playMp4(String fileName) {

    }
}
