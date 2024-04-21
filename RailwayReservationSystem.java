import java.util.ArrayList;
import java.util.Scanner;

public class RailwayReservationSystem {
    private ArrayList<Train> trains = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public RailwayReservationSystem() {
        // Initialize trains
        trains.add(new Train("Mumbai - Delhi", "13:05", 50, 1010));
        trains.add(new Train("Delhi - Jaipur", "7:00", 50, 2013));
        trains.add(new Train("Prayagraj - Delhi", "10:00", 50, 3045));
    }

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("Railway Reservation System");
            System.out.println("1. Train Information");
            System.out.println("2. Seat Availability");
            System.out.println("3. Booking");
            System.out.println("4. Canceling");
            System.out.println("5. Ticket Display");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayTrainInformation();
                    break;
                case 2:
                    displaySeatAvailability();
                    break;
                case 3:
                    displayBookingInfo();
                    break;
                case 4:
                    displayCancelingInfo();
                    break;
                case 5:
                    displayTicketInfo();
                    break;
                case 6:
                    running = false;
                    System.out.println("Thank you using our platform for Booking Railway tickets. Have A Great Day!!!!!!!!!!!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

    private void displayTrainInformation() {
        System.out.println("Train Information");
        System.out.println("Train Name\t\tTime\t\tPassenger Strength\tTrain Number");
        for (Train train : trains) {
            System.out.println(train.getName() + "\t" + train.getTime() + "\t" +
                    train.getPassengerStrength() + "\t\t\t" + train.getTrainNumber());
        }
    }

    private void displaySeatAvailability() {
        System.out.println("Seat Availability");
        for (Train train : trains) {
            System.out.println(train.getName() + " (" + train.getTrainNumber() + ") train has " +
                    (train.getPassengerStrength() - train.bookedSeats.size()) + " seats available.");
        }
    }

    private void displayBookingInfo() {
        System.out.println("Booking");
        System.out.println("Welcome, Booking now! You can Book by online ticket without downtime. UPI accepted and Extra 5% discount on HDFC credit card.");
    }

    private void displayCancelingInfo() {
        System.out.println("Canceling");
        System.out.println("Canceling is now available online method only. Broker charge taken and money will be refunded in 2 to 4 business days. Only applicable before Train chart preparation or 8 hours before train time.");
    }

    private void displayTicketInfo() {
        System.out.println("Ticket Display");
        System.out.println("1. Mumbai-to-Delhi train: 200rs for second seater class ticket, 300rs for sleeper class, 550rs for AC tier class ticket.");
        System.out.println("2. Delhi-to-Jaipur train: 195rs for second seater, 275rs for sleeper class, 402rs for AC tier class.");
    }
}
