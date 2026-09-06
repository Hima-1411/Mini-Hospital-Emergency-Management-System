package hospital;

//Singly Linked List Implementation for Patient Visit History
public class PatientVisitHistory {
 private VisitNode head;

 // 1. Add a new visit to the patient's history
 public void addVisit(int visitId, String visitDate, String doctorName, String diagnosis, String treatment) {
     VisitNode newVisit = new VisitNode(visitId, visitDate, doctorName, diagnosis, treatment);
     if (head == null) {
         head = newVisit;
     } else {
         VisitNode current = head;
         while (current.next != null) {
             current = current.next;
         }
         current.next = newVisit;
     }
     System.out.println("Visit ID " + visitId + " added to history successfully.");
 }

 // 2. Remove a visit by Visit ID
 public void removeVisit(int visitId) {
     if (head == null) {
         System.out.println("Visit history is empty.");
         return;
     }

     // If the visit to be deleted is the first node
     if (head.visitId == visitId) {
         head = head.next;
         System.out.println("Visit ID " + visitId + " removed successfully.");
         return;
     }

     VisitNode current = head;
     while (current.next != null && current.next.visitId != visitId) {
         current = current.next;
     }

     if (current.next != null) {
         current.next = current.next.next;
         System.out.println("Visit ID " + visitId + " removed successfully.");
     } else {
         System.out.println("Visit ID " + visitId + " not found in history.");
     }
 }

 // 3. Search for a visit by Visit ID
 public void searchVisit(int visitId) {
     VisitNode current = head;
     while (current != null) {
         if (current.visitId == visitId) {
             System.out.println("\n--- Visit Record Found ---");
             System.out.println("Visit ID   : " + current.visitId);
             System.out.println("Visit Date : " + current.visitDate);
             System.out.println("Doctor Name: " + current.doctorName);
             System.out.println("Diagnosis  : " + current.diagnosis);
             System.out.println("Treatment  : " + current.treatment);
             return;
         }
         current = current.next;
     }
     System.out.println("Visit ID " + visitId + " not found.");
 }

 // 4. Display all visits in the patient's history
 public void displayHistory() {
     if (head == null) {
         System.out.println("No visit history available.");
         return;
     }

     System.out.println("\n--- Patient Visit History ---");
     VisitNode current = head;
     while (current != null) {
         System.out.println("Visit ID: " + current.visitId + 
                            " | Date: " + current.visitDate + 
                            " | Doctor: " + current.doctorName + 
                            " | Diagnosis: " + current.diagnosis + 
                            " | Treatment: " + current.treatment);
         current = current.next;
     }
 }
}