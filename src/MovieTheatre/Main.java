package MovieTheatre;

public class Main {
    public static void main(String[] args) {
        Theatre sagara= new Theatre("Sagara",10,10);
        sagara.showSeats();
        sagara.reserve("H09");
        sagara.reserve("H09");
        sagara.addMovie("Kinnarathumbikal");
        sagara.addMovie("Better call saul");
        sagara.movieNames();


    }
}
