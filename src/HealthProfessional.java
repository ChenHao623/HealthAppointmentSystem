/**
 * Student's name: Hao Chen
 * Student ID: 24516439
 * Represents a health professional with basic details such as ID, name, and additional info.
 * This is the base class that can be extended by specific types of health professionals
 * like General Practitioners, Dietitians, etc.
 */
public class HealthProfessional {
    protected int id;
    protected String name;
    protected String basicInfo;

    /**
     * Default constructor to initialize a HealthProfessional object with default values.
     */
    public HealthProfessional() {
    }

    /**
     * Constructor to initialize a HealthProfessional object with specific values for ID, name, and basic info.
     *
     * @param id The ID of the health professional.
     * @param name The name of the health professional.
     * @param basicInfo The basic information of the health professional.
     */
    public HealthProfessional(int id, String name, String basicInfo) {
        this.id = id;
        this.name = name;
        this.basicInfo = basicInfo;
    }

    /**
     * Prints the details of the health professional.
     * This includes the ID, name, and basic info.
     */
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Info: " + basicInfo);
    }
}
