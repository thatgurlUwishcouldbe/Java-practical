public class Main {
    public static void main(String[] args) {
        PlayListPlayer player = new PlayListPlayer();
        
        AudioFile song1 = new AudioFile("The Weekbd","Montreal",249);
        AudioFile song2 = new AudioFile("The Weekbd","In The Night",234);
        AudioFile song3 = new AudioFile("Chris Brown","Angel Numbers",306);
        AudioFile song4 = new AudioFile("Daniel Di Angelo ","Lose Face",213);
        
        player.addNewAudio(song4);
        player.addNewAudio(song3);
        player.addNewAudio(song2);
        player.addNewAudio(song1);
        
        player.playCurrent();
        
        player.playNext();
        player.playNext();
        player.playCurrent();
        
        player.playPrevious();
        player.playCurrent();
    }
}
