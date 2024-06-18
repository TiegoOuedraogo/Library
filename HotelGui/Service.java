package HotelGui;

public class Service {
    public static final double BREAKFAST_COST = 10;  // Cost for breakfast per person per day
    public static final double ROOM_SERVICE_COST = 20;  // Cost for room service per meal per person
    public static final double LAUNDRY_COST = 5;  // Cost for laundry per item
    public static final double NYC_TAX_RATE = 0.08875;  // NYC tax rate

    // Method to calculate the cost of a specific service
    public static double calculateServiceCost(String serviceType, int quantity) {
        switch (serviceType.toLowerCase()) {
            case "breakfast":
                return BREAKFAST_COST * quantity;
            case "roomservice":
                return ROOM_SERVICE_COST * quantity;
            case "laundry":
                return LAUNDRY_COST * quantity;
            default:
                return 0;
        }
    }

    // Method to calculate total bill including tax
    public static double calculateTotalWithTax(double totalBill) {
        return totalBill + (totalBill * NYC_TAX_RATE);
    }
}

