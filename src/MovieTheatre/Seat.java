package MovieTheatre;

public class Seat implements Comparable<Seat>{
    private String seatNumber;
    private boolean reserved=false;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }
    public boolean isReserved(){
        if(!reserved){
            reserved= true;
            return true;
        }
        return false;

    }

    @Override
    public int compareTo(Seat o) {
        return this.seatNumber.compareToIgnoreCase(o.seatNumber);
    }
}
