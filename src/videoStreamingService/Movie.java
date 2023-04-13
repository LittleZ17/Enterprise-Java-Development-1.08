package videoStreamingService;

import java.util.Date;

public class Movie extends  Video {
    private int yearRelease;

    public Movie(String tile, int duration, int yearRelease) {
        super(tile, duration);
        this.yearRelease = yearRelease;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public void play() {
        System.out.println("Your film " + getTile() + " will start soon");
    }
}
