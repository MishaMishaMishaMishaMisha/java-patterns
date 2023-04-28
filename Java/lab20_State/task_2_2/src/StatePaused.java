public class StatePaused implements State {

    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StatePaused());
        mediaPlayer.setIcon("play button");
        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
    }
    public void pause(MediaPlayer mediaPlayer) {
        return;
    }

}

