package videoStreamingService;

public abstract class Video {

    private String tile;
    private int duration;

    public Video(String tile, int duration) {
        this.tile = tile;
        this.duration = duration;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public abstract void play();
}
