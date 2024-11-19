/**
 * Represents a General Practitioner health professional, a type of health professional
 * that provides general medical services.
 */
public class GeneralPractitioner extends HealthProfessional {
    private String speciality;

    /**
     * Default constructor that initializes a GeneralPractitioner object with default values.
     * It calls the superclass's default constructor to initialize common fields.
     */
    public GeneralPractitioner() {
        super();
    }

    /**
     * Constructor to initialize a GeneralPractitioner object with specific values for ID, name, basic info, and speciality.
     *
     * @param id The ID of the general practitioner.
     * @param name The name of the general practitioner.
     * @param basicInfo Basic information about the general practitioner.
     * @param speciality The speciality of the general practitioner.
     */
    public GeneralPractitioner(int id, String name, String basicInfo, String speciality) {
        super(id, name, basicInfo);
        this.speciality = speciality;
    }

    /**
     * Prints the details of the general practitioner.
     */
    @Override
    public void printDetails() {
        System.out.println("The health professional details are:");
        super.printDetails();
        System.out.println("Speciality: " + speciality);
        System.out.println("Profession: General Practitioner");
    }
}
