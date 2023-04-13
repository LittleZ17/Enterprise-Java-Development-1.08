package videoStreamingService;

public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Titanic", 180, 1997);
        TvSeries tvSeries = new TvSeries("Modern Family", 30, 8, 5);

        movie.play();
        tvSeries.play();

    }
}
