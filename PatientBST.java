package hospital;

public class PatientBST {

    private PatientNode root;

    // Insert a patient
    public void insert(Patient patient) {
        root = insertRecursive(root, patient);
    }

    private PatientNode insertRecursive(PatientNode current, Patient patient) {

        if (current == null) {
            return new PatientNode(patient);
        }

        if (patient.getPatientId() < current.patient.getPatientId()) {
            current.left = insertRecursive(current.left, patient);
        }
        else if (patient.getPatientId() > current.patient.getPatientId()) {
            current.right = insertRecursive(current.right, patient);
        }
        else {
            System.out.println("Patient ID already exists.");
        }

        return current;
    }

    // Search patient
    public Patient search(int patientId) {
        PatientNode result = searchRecursive(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }

    private PatientNode searchRecursive(PatientNode current, int patientId) {

        if (current == null) {
            return null;
        }

        if (patientId == current.patient.getPatientId()) {
            return current;
        }

        if (patientId < current.patient.getPatientId()) {
            return searchRecursive(current.left, patientId);
        }

        return searchRecursive(current.right, patientId);
    }

    // In-order traversal
    public void inOrder() {
        inOrderRecursive(root);
    }

    private void inOrderRecursive(PatientNode current) {

        if (current != null) {
            inOrderRecursive(current.left);

            current.patient.displayPatient();
            System.out.println("--------------------");

            inOrderRecursive(current.right);
        }
    }
 // Delete a patient
    public void delete(int patientId) {
        root = deleteRecursive(root, patientId);
    }

    private PatientNode deleteRecursive(PatientNode current, int patientId) {

        if (current == null) {
            System.out.println("Patient not found.");
            return null;
        }

        if (patientId < current.patient.getPatientId()) {
            current.left = deleteRecursive(current.left, patientId);
        }
        else if (patientId > current.patient.getPatientId()) {
            current.right = deleteRecursive(current.right, patientId);
        }
        else {

            // Case 1: No child
            if (current.left == null && current.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (current.left == null) {
                return current.right;
            }

            // Case 3: Only left child
            if (current.right == null) {
                return current.left;
            }

            // Case 4: Two children
            PatientNode smallestNode = findSmallest(current.right);

            current.patient = smallestNode.patient;

            current.right = deleteRecursive(
                current.right,
                smallestNode.patient.getPatientId()
            );
        }

        return current;
    }

    // Find smallest node
    private PatientNode findSmallest(PatientNode node) {

        while (node.left != null) {
            node = node.left;
        }

        return node;
    }
}
