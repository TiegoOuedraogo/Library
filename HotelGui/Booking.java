package HotelGui;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Booking {
    private Customer customer;
    private Room room;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private boolean checkedIn;
    private boolean checkedOut;
    private double totalBill;
    private List<String> billBreakdown;

    public Booking(Customer customer, Room room, LocalDate checkInDate, LocalDate checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.checkedIn = false;
        this.checkedOut = false;
        this.billBreakdown = new ArrayList<>();
        this.totalBill = calculateInitialBill();
    }

    private double calculateInitialBill() {
        long numberOfNights = ChronoUnit.DAYS.between(checkInDate, checkOutDate);
        double roomCharge = numberOfNights * room.getRate();
        billBreakdown.add("Room Charge (" + numberOfNights + " nights at £" + room.getRate() + "/night): £" + roomCharge);
        return roomCharge;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Room getRoom() {
        return room;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void checkIn() {
        this.checkedIn = true;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void checkOut() {
        this.checkedOut = true;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public List<String> getBillBreakdown() {
        return billBreakdown;
    }

    public void addToBill(String description, double amount) {
        totalBill += amount;
        billBreakdown.add(description + ": £" + amount);
    }
}
