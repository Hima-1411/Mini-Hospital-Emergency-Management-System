package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PatientBST bst = new PatientBST();
        EmergencyQueue queue = new EmergencyQueue();
        TreatmentStack stack = new TreatmentStack();
        PatientVisitHistory visitHistory = new PatientVisitHistory();

        // Sample Pre-loaded Data
        bst.insert(new Patient(101, "Kamal Silva", 45, "0771234567", "Chest Pain"));
        queue.enqueue(new Patient(201, "Nimal Perera", 30, "0719876543", "High Fever"));

        while (true) {
            System.out.println("\n==========================================================");
            System.out.println("   🏥 MINI HOSPITAL EMERGENCY MANAGEMENT SYSTEM 🏥");
            System.out.println("==========================================================");
            System.out.println("1. Binary Search Tree (BST) - Patient Management");
            System.out.println("2. Priority Queue - Emergency Triage");
            System.out.println("3. Stack - Treatment Records");
            System.out.println("4. Singly Linked List - Patient Visit History");
            System.out.println("5. Exit System");
            System.out.print("👉 Choose an option (1-5): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n--- 📌 BST Operations ---");
                    System.out.println("1. Insert Patient | 2. Search Patient | 3. Display All Patients");
                    System.out.print("Choose action: ");
                    int bstChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (bstChoice == 1) {
                        System.out.print("Enter Patient ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Contact: ");
                        String contact = scanner.nextLine();
                        System.out.print("Enter Condition: ");
                        String condition = scanner.nextLine();

                        bst.insert(new Patient(id, name, age, contact, condition));
                        System.out.println("✅ Patient inserted successfully!");
                    } else if (bstChoice == 2) {
                        System.out.print("Enter Patient ID to Search: ");
                        int searchId = scanner.nextInt();
                        Patient p = bst.search(searchId);
                        if (p != null) {
                            System.out.println("✅ Found: ID " + p.getPatientId() + " - " + p.getPatientName());
                        } else {
                            System.out.println("❌ Patient Not Found!");
                        }
                    } else {
                        System.out.println("\n📋 All Patients:");
                        bst.displayAll();
                    }
                    break;

                case 2:
                    System.out.println("\n--- 📌 Emergency Queue Operations ---");
                    System.out.println("1. Enqueue Patient | 2. Dequeue | 3. Display Queue");
                    System.out.print("Choose action: ");
                    int qChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (qChoice == 1) {
                        System.out.print("Enter Patient ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Contact: ");
                        String contact = scanner.nextLine();
                        System.out.print("Enter Condition: ");
                        String condition = scanner.nextLine();

                        queue.enqueue(new Patient(id, name, age, contact, condition));
                        System.out.println("✅ Added to Queue!");
                    } else if (qChoice == 2) {
                        queue.dequeue();
                    } else {
                        queue.displayQueue();
                    }
                    break;

                case 3:
                    System.out.println("\n--- 📌 Treatment Stack Operations ---");
                    System.out.println("1. Pop Treatment | 2. Display Stack");
                    System.out.print("Choose action: ");
                    int sChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (sChoice == 1) {
                        stack.pop();
                    } else {
                        // stack.display(); அல்லது stack.displayStack(); எது உன்னுடைய TreatmentStack.java-வில் உள்ளதோ அதை வைக்கவும்
                        stack.displayHistory(); 
                    }
                    break;

                case 4:
                    System.out.println("\n--- 📌 Visit History Operations ---");
                    System.out.println("1. Display History");
                    System.out.print("Choose action: ");
                    int vChoice = scanner.nextInt();
                    scanner.nextLine();

                    visitHistory.displayHistory();
                    break;

                case 5:
                    System.out.println("Exiting System!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
