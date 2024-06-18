package HotelGui;

public class Room {
    private String type;  // Type of the room (e.g., Double Standard, Deluxe Double)
    private double rate;  // Rate per night for the room
    private boolean cleaned;  // Status of cleaning
    private boolean occupied;  // Status of occupancy

    // Constructor to initialize room details
    public Room(String type, double rate) {
        this.type = type;
        this.rate = rate;
        this.cleaned = true;  // Initially clean
        this.occupied = false;  // Initially not occupied
    }

    // Getter and setter methods for room details
    public String getType() {
        return type;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public boolean isCleaned() {
        return cleaned;
    }

    public void setCleaned(boolean cleaned) {
        this.cleaned = cleaned;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}

