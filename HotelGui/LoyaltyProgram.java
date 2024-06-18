package HotelGui;

public class LoyaltyProgram {
    private static final int MAX_DISCOUNT = 20;  // Maximum discount percentage
    private static final int POINTS_PER_NIGHT = 1;  // Points earned per night

    // Method to calculate the discount based on loyalty points
    public static int calculateDiscount(Customer customer) {
        return Math.min(customer.getLoyaltyPoints() * POINTS_PER_NIGHT, MAX_DISCOUNT);
    }
}
