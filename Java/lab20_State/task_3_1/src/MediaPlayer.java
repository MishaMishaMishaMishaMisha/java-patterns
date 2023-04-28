import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {

    final private List<String> tracks = new ArrayList<>();
    private State state;
    private int currentTrackNum = 0;

    public MediaPlayer() {
        state = new StateStopped();
    }


    public String getCurrentTrack() {
        return tracks.get(currentTrackNum);
    }

    public void setTrackNum(int trackNum) {
        if (trackNum < 0 || trackNum >= tracks.size()) {
            return;
        }

        this.currentTrackNum = trackNum;
    }

    public int getCurrentTrackNum() {
        return currentTrackNum;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void play() {
        if (state == null) {
            return;
        }
        else {
            state.play(this);
        }
    }

    public void pause() {
        if (state == null) {
            return;
        }
        else {
            state.pause(this);
        }
    }

    public void next() {
        if (state == null) {
            return;
        }
        else {
            state.next(this);
        }
    }

    public void prev() {
        if (state == null) {
            return;
        }
        else {
            state.prev(this);
        }
    }

    public void stop() {
        if (state == null) {
            return;
        }
        else {
            state.stop(this);
        }
    }

}