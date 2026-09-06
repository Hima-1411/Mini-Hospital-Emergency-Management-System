package hospital; 
public class VisitNode {
    int visitId;
    String visitDate;
    String doctorName;
    String diagnosis;
    String treatment;
    VisitNode next; // Pointer to the next visit node in the Singly Linked List

    // Constructor
    public VisitNode(int visitId, String visitDate, String doctorName, String diagnosis, String treatment) {
        this.visitId = visitId;
        this.visitDate = visitDate;
        this.doctorName = doctorName;
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.next = null;
    }
}