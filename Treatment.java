package hospital;

public class Treatment {

    private int patientId;
    private String treatmentDescription;

    // Constructor
    public Treatment(int patientId, String treatmentDescription) {
        this.patientId = patientId;
        this.treatmentDescription = treatmentDescription;
    }

    // Getter for patient ID
    public int getPatientId() {
        return patientId;
    }

    // Getter for treatment description
    public String getTreatmentDescription() {
        return treatmentDescription;
    }

    // Display treatment
    public void displayTreatment() {
        System.out.println(
                "Patient ID: " + patientId
                + " | Treatment: " + treatmentDescription
        );
    }
}