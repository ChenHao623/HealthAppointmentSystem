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
    }
}
