package HotelGui;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;  // Name of the hotel
    private List<Room> rooms;  // List of rooms in the hotel
    private List<Booking> bookings;  // List of bookings in the hotel

    // Constructor to initialize hotel details
    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }

    // Getter methods for hotel details
    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    // Methods to add rooms and bookings
    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }

    // Method to find an available room of a specific type
    public Room findAvailableRoom(String type) {
        for (Room room : rooms) {
            if (room.getType().equals(type) && !room.isOccupied() && room.isCleaned()) {
                return room;
            }
        }
        return null;
    }

    // Method to clean a room
    public void cleanRoom(Room room) {
        room.setCleaned(true);
    }

    // Methods to check in and check out a booking
    public void checkIn(Booking booking) {
        booking.checkIn();
        booking.getRoom().setOccupied(true);
        booking.getRoom().setCleaned(false);
    }

    public void checkOut(Booking booking) {
        booking.checkOut();
        booking.getRoom().setOccupied(false);
        booking.getCustomer().addLoyaltyPoints((int)booking.getTotalBill() / booking.getRoom().getRate());
    }
}

