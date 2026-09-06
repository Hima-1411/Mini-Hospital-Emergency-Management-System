package hospital;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<Patient> queue;

    // Constructor
    public EmergencyQueue() {
        queue = new LinkedList<>();
    }

    // Enqueue - add patient
    public void enqueue(Patient patient) {
        queue.add(patient);
        System.out.println(
            patient.getPatientName() + " added to emergency queue."
        );
    }

    // Dequeue - remove next patient
    public Patient dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        Patient patient = queue.poll();

        System.out.println(
            patient.getPatientName() + " removed from emergency queue."
        );

        return patient;
    }

    // Display waiting patients
    public void displayQueue() {

        if (queue.isEmpty()) {
            System.out.println("No patients are waiting.");
            return;
        }

        System.out.println("=== EMERGENCY WAITING QUEUE ===");

        for (Patient patient : queue) {
            System.out.println(
                "ID: " + patient.getPatientId()
                + " | Name: " + patient.getPatientName()
            );
        }
    }

    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}