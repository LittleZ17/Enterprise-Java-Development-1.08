package videoStreamingService;

public class TvSeries extends Video{

    private int season;
    private int episode;

    public TvSeries(String tile, int duration, int season, int episode) {
        super(tile, duration);
        this.season = season;
        this.episode = episode;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }

    @Override
    public void play() {
        System.out.println(getTile() + " season: " + getSeason() + " episode: " + getEpisode() + " to start soon." );
    }
}
