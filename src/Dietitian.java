/**
 * Represents a Dietitian health professional, a type of health professional that provides advice on diet and nutrition.
 */
public class Dietitian extends HealthProfessional {
    private String dietType;

    /**
     * Default constructor that initializes a Dietitian object with default values.
     */
    public Dietitian() {
        super();
        this.dietType = "General Diet";
    }

    /**
     * Constructor to initialize a Dietitian object with specific values for ID, name, basic info, and diet type.
     *
     * @param id The ID of the dietitian.
     * @param name The name of the dietitian.
     * @param basicInfo Basic information about the dietitian.
     * @param dietType The diet type of the dietitian.
     */
    public Dietitian(int id, String name, String basicInfo, String dietType) {
        super(id, name, basicInfo);
        this.dietType = dietType;
    }

    /**
     * Prints the details of the dietitian.
     */
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Diet Type: " + dietType);
        System.out.println("Profession: Dietitian");
    }
}
