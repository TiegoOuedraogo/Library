package HotelGui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class MainGUI {
    private JFrame frame;
    private Hotel hotel;

    public MainGUI() {
        hotel = new Hotel("Luxury Hotel");
        populateInitialRooms();
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(0, 1, 0, 0));

        JButton btnBookRoom = new JButton("Book a Room");
        btnBookRoom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bookRoom();
            }
        });
        panel.add(btnBookRoom);

        JButton btnCheckIn = new JButton("Check-in");
        btnCheckIn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkIn();
            }
        });
        panel.add(btnCheckIn);

        JButton btnCheckOut = new JButton("Check-out");
        btnCheckOut.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkOut();
            }
        });
        panel.add(btnCheckOut);

        JButton btnManageRoomRates = new JButton("Manage Room Rates");
        btnManageRoomRates.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                manageRoomRates();
            }
        });
        panel.add(btnManageRoomRates);
    }

    public void show() {
        frame.setVisible(true);
    }

    private void populateInitialRooms() {
        hotel.addRoom(new Room("Double Standard", 150));
        hotel.addRoom(new Room("Double Standard", 150));
        hotel.addRoom(new Room("Deluxe Double", 200));
        hotel.addRoom(new Room("Deluxe Double", 200));
        hotel.addRoom(new Room("Junior Suite", 300));
        hotel.addRoom(new Room("Grand Suite", 400));
    }

    private void bookRoom() {
        JTextField customerNameField = new JTextField();
        JTextField guestNameField = new JTextField();
        JComboBox<String> roomTypeComboBox = new JComboBox<>(new String[] {
                "Double Standard",
                "Deluxe Double",
                "Junior Suite",
                "Grand Suite"
        });
        JTextField checkInDateField = new JTextField();
        JTextField checkOutDateField = new JTextField();

        Object[] message = {
            "Customer Name:", customerNameField,
            "Guest Name:", guestNameField,
            "Room Type:", roomTypeComboBox,
            "Check-in Date (yyyy-mm-dd):", checkInDateField,
            "Check-out Date (yyyy-mm-dd):", checkOutDateField
        };

        int option = JOptionPane.showConfirmDialog(frame, message, "Book a Room", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String customerName = customerNameField.getText();
            String guestName = guestNameField.getText();
            String roomType = (String) roomTypeComboBox.getSelectedItem();
            LocalDate checkInDate = LocalDate.parse(checkInDateField.getText());
            LocalDate checkOutDate = LocalDate.parse(checkOutDateField.getText());

            Room room = hotel.findAvailableRoom(roomType);
            if (room != null) {
                Customer customer = new Customer(customerName, guestName);
                Booking booking = new Booking(customer, room, checkInDate, checkOutDate);
                hotel.addBooking(booking);
                JOptionPane.showMessageDialog(frame, "Room booked successfully!");
            } else {
                JOptionPane.showMessageDialog(frame, "No available rooms of the specified type.");
            }
        }
    }

    private void checkIn() {
        String customerName = JOptionPane.showInputDialog("Enter customer name:");

        for (Booking booking : hotel.getBookings()) {
            if (booking.getCustomer().getName().equals(customerName) && !booking.isCheckedIn() && !booking.isCheckedOut()) {
                hotel.checkIn(booking);
                JOptionPane.showMessageDialog(frame, "Checked in successfully!");
                return;
            }
        }
        JOptionPane.showMessageDialog(frame, "No booking found for the specified customer.");
    }

    private void checkOut() {
        String customerName = JOptionPane.showInputDialog("Enter customer name:");

        for (Booking booking : hotel.getBookings()) {
            if (booking.getCustomer().getName().equals(customerName) && booking.isCheckedIn() && !booking.isCheckedOut()) {
                hotel.checkOut(booking);

                // Example of adding services to the bill
                booking.addToBill("Breakfast (2 people)", Service.calculateServiceCost("breakfast", 2));  // 2 breakfasts
                booking.addToBill("Room Service (1 meal)", Service.calculateServiceCost("roomservice", 1));  // 1 room service

                double totalBill = booking.getTotalBill();
                double totalWithTax = Service.calculateTotalWithTax(totalBill);

                StringBuilder breakdown = new StringBuilder();
                for (String item : booking.getBillBreakdown()) {
                    breakdown.append(item).append("\n");
                }
                breakdown.append(String.format("Total (including NYC tax): £%.2f", totalWithTax));

                JOptionPane.showMessageDialog(frame, "Checked out successfully!\n" + breakdown.toString());
                return;
            }
        }
        JOptionPane.showMessageDialog(frame, "No booking found for the specified customer.");
    }

    private void manageRoomRates() {
        JTextField roomTypeField = new JTextField();
        JTextField newRateField = new JTextField();

        Object[] message = {
            "Room Type:", roomTypeField,
            "New Rate:", newRateField
        };

        int option = JOptionPane.showConfirmDialog(frame, message, "Manage Room Rates", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            String roomType = roomTypeField.getText();
            double newRate = Double.parseDouble(newRateField.getText());

            for (Room room : hotel.getRooms()) {
                if (room.getType().equals(roomType)) {
                    room.setRate(newRate);
                }
            }
            JOptionPane.showMessageDialog(frame, "Room rates updated successfully!");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainGUI window = new MainGUI();
                    window.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


