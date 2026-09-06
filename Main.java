
package hospital;

public class Main {

    public static void main(String[] args) {

        // Create BST
        PatientBST patientBST = new PatientBST();

        // Create Emergency Queue
        EmergencyQueue emergencyQueue = new EmergencyQueue();

        // Create Treatment Stack
        TreatmentStack treatmentStack = new TreatmentStack();
        
     // PatientVisitHistory Test Demonstration
        PatientVisitHistory visitHistory = new PatientVisitHistory();

        System.out.println("\n=== PATIENT VISIT HISTORY (SINGLY LINKED LIST) ===");
        // 1. Add Visits
        visitHistory.addVisit(501, "2026-01-10", "Dr. Perera", "Fever", "Paracetamol");
        visitHistory.addVisit(502, "2026-02-15", "Dr. Silva", "Flu", "Rest & Antibiotics");
        visitHistory.addVisit(503, "2026-03-01", "Dr. Fernando", "Chest Pain", "ECG Test");

        // 2. Display All Visits
        visitHistory.displayHistory();

        // 3. Search Visit
        visitHistory.searchVisit(502);

        // 4. Remove Visit
        visitHistory.removeVisit(502);

        // 5. Display History After Removal
        visitHistory.displayHistory();


        // =========================
        // CREATE PATIENTS
        // =========================

        Patient p1 = new Patient(
                101,
                "Ahmed",
                25,
                "0771234567",
                "Fever"
        );

        Patient p2 = new Patient(
                105,
                "Aisha",
                30,
                "0772345678",
                "Headache"
        );

        Patient p3 = new Patient(
                99,
                "Mohamed",
                45,
                "0773456789",
                "Diabetes"
        );


        // =========================
        // BST - INSERT PATIENTS
        // =========================

        patientBST.insert(p1);
        patientBST.insert(p2);
        patientBST.insert(p3);


        // =========================
        // EMERGENCY QUEUE
        // =========================

        System.out.println("\n=== EMERGENCY QUEUE ===");

        emergencyQueue.enqueue(p1);
        emergencyQueue.enqueue(p2);
        emergencyQueue.enqueue(p3);

        emergencyQueue.displayQueue();


        // =========================
        // DEQUEUE
        // =========================

        System.out.println("\n=== NEXT PATIENT FOR TREATMENT ===");

        Patient nextPatient = emergencyQueue.dequeue();

        if (nextPatient != null) {
            System.out.println(
                    "Now treating: " + nextPatient.getPatientName()
            );
        }


        // =========================
        // QUEUE AFTER DEQUEUE
        // =========================

        System.out.println("\n=== QUEUE AFTER DEQUEUE ===");

        emergencyQueue.displayQueue();


        // =========================
        // DISPLAY ALL PATIENTS
        // =========================

        System.out.println("\n=== ALL PATIENTS ===");

        patientBST.inOrder();


        // =========================
        // SEARCH PATIENT
        // =========================

        System.out.println("\n=== SEARCH PATIENT ===");

        Patient result = patientBST.search(105);

        if (result != null) {
            result.displayPatient();
        } else {
            System.out.println("Patient not found.");
        }


        // =========================
        // DELETE PATIENT
        // =========================

        System.out.println("\n=== DELETE PATIENT 99 ===");

        patientBST.delete(99);


        // =========================
        // PATIENTS AFTER DELETE
        // =========================

        System.out.println("\n=== PATIENTS AFTER DELETE ===");

        patientBST.inOrder();


        // =========================
        // TREATMENT HISTORY
        // =========================

        System.out.println("\n=== TREATMENT HISTORY ===");

        Treatment t1 = new Treatment(
                101,
                "Initial diagnosis"
        );

        Treatment t2 = new Treatment(
                101,
                "Blood test"
        );

        Treatment t3 = new Treatment(
                101,
                "Medication prescribed"
        );

        treatmentStack.push(t1);
        treatmentStack.push(t2);
        treatmentStack.push(t3);

        treatmentStack.displayHistory();



        System.out.println("\n=== POP LATEST TREATMENT ===");

        Treatment latestTreatment = treatmentStack.pop();

        if (latestTreatment != null) {
            latestTreatment.displayTreatment();
        }
        
     }
}
