package MovieTheatre;

import java.util.*;

public class Theatre {
    private String theatreName;
    List<Seat> seats = new ArrayList<>();
    List<String> movies = new ArrayList<>();
    private int numberOfRows;
    private int seatsPerRow;

    public Theatre(String theatreName, int numberOfRows, int seatsPerRow) {
        this.theatreName = theatreName;
        this.numberOfRows = numberOfRows;
        this.seatsPerRow = seatsPerRow;
        int lastRow = 'A' + (numberOfRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int i = 1; i <= seatsPerRow; i++) {
                Seat seat = new Seat(row + String.format("%02d", i));
                seats.add(seat);
            }
        }
    }

    public void showSeats() {
        System.out.println("The seats are");
        int i = 1;
        for (Seat s : seats) {
            System.out.print(s.getSeatNumber() + " ");
            if (i % numberOfRows == 0) {
                System.out.println();
            }
            i++;
        }
    }


    public boolean reserve(String seatNumber) {
        Seat seat = new Seat(seatNumber);
        int requestedSeat = Collections.binarySearch(seats, seat, null);
        System.out.println(requestedSeat);
        if(requestedSeat>=0){
            if(seat.isReserved()==true){
                System.out.println("The seat is now reserved proceed to pay");
                return true;
            }
            else{
                System.out.println("Seat already reserved");
                return false;
            }
        }
        else{
            System.out.println("Seat not found");
            return false;
        }
    }
//        for (Seat s : seats) {
//            System.out.print(".");
//            if (s.getSeatNumber().equals(seatNumber)) {
//                if (s.isReserved()) {
//                    System.out.println("Proceed to pay");
//                    seat = s;
//                    return true;
//                } else {
//                    System.out.println("This seat is already reserved");
//                    seat = s;
//                    return false;
//                }
//            }
//        }
//        if (seat == null) {
//            System.out.println("Seat not found");
//        }
//        return f


    public void addMovie(String movieName) {
        if (movies.contains(movieName)) {
            System.out.println("Movie already in premiered in the theatre");
        } else {
            movies.add(movieName);
            System.out.println(movieName + " added to the theatre shows");
        }
    }

    public String movieNames() {
        String movieList = "";
        for (String s : movies) {
            movieList = s + " ";
            System.out.println(movieList);
        }
        return movieList;
    }

}
