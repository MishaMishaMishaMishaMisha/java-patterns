public class StatePaused implements State {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StatePaused());
        mediaPlayer.setIcon("play button");
        System.out.println("Video paused, icon set to " + mediaPlayer.getIcon());
    }
    @Override
    public void pause(MediaPlayer mediaPlayer) {
        return;
    }

}

