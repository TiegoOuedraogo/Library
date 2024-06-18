package HotelGui;

public class Customer {
    private String name;  // Primary customer's name
    private String guestName;  // Guest's name
    private int loyaltyPoints;  // Loyalty points earned by the customer

    // Constructor to initialize customer details
    public Customer(String name, String guestName) {
        this.name = name;
        this.guestName = guestName;
        this.loyaltyPoints = 0;  // Initialize loyalty points to 0
    }

    // Getter methods for customer details
    public String getName() {
        return name;
    }

    public String getGuestName() {
        return guestName;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    // Method to add loyalty points to the customer
    public void addLoyaltyPoints(double d) {
        loyaltyPoints += d;
    }
}

