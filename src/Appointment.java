/**
 * Represents an appointment made by a patient with a health professional.
 */
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String timeSlot;
    private HealthProfessional doctor;

    /**
     * Default constructor that initializes an Appointment object with default values.
     */
    public Appointment() {
    }

    /**
     * Constructor to initialize an Appointment object with specific values for patient name, mobile, time slot, and doctor.
     *
     * @param patientName The name of the patient.
     * @param patientMobile The mobile number of the patient.
     * @param timeSlot The preferred time slot for the appointment.
     * @param doctor The doctor assigned to the appointment.
     */
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    /**
     * Prints the details of the appointment, including the patient's name, mobile number, time slot,
     * and the doctor's details.
     */
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Doctor: ");
        doctor.printDetails();
    }

    /**
     * Gets the mobile number of the patient.
     *
     * @return The mobile number of the patient.
     */
    public String getPatientMobile() {
        return patientMobile;
    }
}
