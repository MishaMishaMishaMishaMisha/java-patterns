public class StatePlaying implements State {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        return;
    }
    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StatePlaying());
        mediaPlayer.setIcon("pause button");
        System.out.println("Video playing, icon set to " + mediaPlayer.getIcon());
    }

}

