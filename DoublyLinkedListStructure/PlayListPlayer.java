public class PlayListPlayer {

    private DoublyLinkedList<AudioFile> audioList;

    public PlayListPlayer() {
        audioList = new DoublyLinkedList<>();
        audioList.moveToStart();
    }

    public void addNewAudio(AudioFile a) {
        audioList.addLast(a);
    }

    public void playCurrent() {
        if (audioList.isEmpty()) {
            System.out.println("Play list EMPTY");
        }
        System.out.println(audioList.getValue());
    }

    public void playNext() {
        audioList.moveToNext();
        playCurrent();
    }

    public void playPrevious() {
        audioList.moveToPrev();
        playCurrent();
    }

    public static DoublyLinkedList<AudioFile> mergePlayList(DoublyLinkedList<AudioFile> playList1, DoublyLinkedList<AudioFile> playList2) {
        DoublyLinkedList<AudioFile> demo = new DoublyLinkedList<>();
        playList1.moveToStart();
        playList2.moveToStart();
        int i = 0;
        int count = 0;
        while (i < playList1.size() || i < playList2.size()) {
            if (playList1.getValue()== null) {
                demo.addLast(playList2.getValue());
            } else if (playList1.getValue()== null) {
                demo.addLast(playList1.getValue());
            } else {
                demo.addLast(playList1.getValue());
                demo.addLast(playList2.getValue());
                playList1.moveToNext();
                playList2.moveToNext();
            }
            i++;
        }

        return demo;
    }
    
    public String print(){
        String result = null;
        return result;
    }
}
