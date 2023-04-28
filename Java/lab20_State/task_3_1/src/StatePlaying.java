public class StatePlaying implements State {

    @Override
    public void play(MediaPlayer mediaPlayer) {
        return;
    }
    @Override
    public void pause(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StatePaused());
        System.out.println("Track " + mediaPlayer.getCurrentTrack() + " paused");
    }
    @Override
    public void stop(MediaPlayer mediaPlayer) {
        mediaPlayer.setState(new StateStopped());
        System.out.println("Track " + mediaPlayer.getCurrentTrack() + " stopped");
    }
    @Override
    public void next(MediaPlayer mediaPlayer) {
        int curTrack = mediaPlayer.getCurrentTrackNum();
        int numTracks = mediaPlayer.getTracks().size();

        if (curTrack+1 == numTracks) {
            mediaPlayer.setTrackNum(0);
        }
        else {
            mediaPlayer.setTrackNum(curTrack+1);
        }
        System.out.println("Next Track " + mediaPlayer.getCurrentTrack() + " playing");
    }
    @Override
    public void prev(MediaPlayer mediaPlayer) {
        int curTrack = mediaPlayer.getCurrentTrackNum();
        int numTracks = mediaPlayer.getTracks().size();

        if (curTrack == 0) {
            mediaPlayer.setTrackNum(numTracks-1);
        }
        else {
            mediaPlayer.setTrackNum(curTrack-1);
        }
        System.out.println("Prev Track " + mediaPlayer.getCurrentTrack() + " playing");
    }

}
