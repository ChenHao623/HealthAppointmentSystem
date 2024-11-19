import java.util.ArrayList;

/**
 * The main class to manage the appointment system, including creating appointments,
 * printing existing appointments, and canceling appointments for patients.
 */
public class AssignmentOne {
    /**
     * The main method where the program execution starts.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Part 3 – Using classes and objects
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "John Smith",
                "GP with 10 years of experience", "Family Medicine");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Lisa",
                "Experienced GP", "Pediatrics");
        GeneralPractitioner gp3 = new GeneralPractitioner(3, "Mark White",
                "GP with 5 years of experience", "Elderly Care");

        Dietitian dietitian1 = new Dietitian(4, "Anna Wilson",
                "Specialist in healthy eating", "Sports Nutrition");
        Dietitian dietitian2 = new Dietitian(5, "Emily Davis",
                "Experienced dietitian", "Weight Loss");

        gp1.printDetails();
        gp2.printDetails();
        gp3.printDetails();
        dietitian1.printDetails();
        dietitian2.printDetails();
        System.out.println("------------------------------");

        // Part 5 – Collection of appointments
        ArrayList<Appointment> appointments = new ArrayList<>();
        createAppointment(appointments, "James Bond", "1234567890", "08:00", gp1);
        createAppointment(appointments, "Tony Stark", "1112233445", "14:30", gp2);
        createAppointment(appointments, "Sherlock Holmes", "0987654321", "10:00", dietitian1);
        createAppointment(appointments, "Bruce Wayne", "2233445566", "12:00", dietitian2);
        printExistingAppointments(appointments);
        cancelBooking(appointments, "1234567890");
        printExistingAppointments(appointments);
        System.out.println("------------------------------");
    }

    /**
     * Creates a new appointment and adds it to the list of appointments.
     * If the input details are valid, the appointment will be created and added to the list.
     *
     * @param appointments The list of appointments to which the new appointment will be added.
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param timeSlot The time slot for the appointment.
     * @param doctor The doctor assigned to the appointment.
     */
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName,
                                         String patientMobile, String timeSlot, HealthProfessional doctor) {
        if (patientName != null && patientMobile != null && timeSlot != null && doctor != null) {
            Appointment appointment = new Appointment(patientName, patientMobile, timeSlot, doctor);
            appointments.add(appointment);
            System.out.println("Create appointment successfully for " + patientName);
        } else {
            System.out.println("Failed to create appointment.");
        }
    }

    /**
     * Prints all the existing appointments in the list.
     * If there are no appointments, a message will be printed to indicate this.
     *
     * @param appointments The list of appointments to print.
     */
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println();
            }
        }
    }

    /**
     * Cancels an appointment by searching for the patient using their mobile number.
     * If the appointment is found, it is removed from the list. If not, a message is printed.
     *
     * @param appointments The list of appointments to search in.
     * @param patientMobile The mobile number of the patient whose appointment needs to be canceled.
     */
    public static void cancelBooking(ArrayList<Appointment> appointments, String patientMobile) {
        boolean found = false;
        for (Appointment appointment : appointments) {
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointments.remove(appointment);
                System.out.println("Cancel appointment for patient with mobile " + patientMobile);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No appointment found for the given mobile number.");
        }
    }
}
