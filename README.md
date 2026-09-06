# Mini Hospital Emergency Management System

A Java-based console application designed to manage hospital emergency operations efficiently using fundamental Data Structures.

---

## 🛠️ Data Structures Implemented

1. **Binary Search Tree (BST)** - `PatientBST.java` & `Patient.java`
   * Efficient patient record lookup, insertion, and display by Patient ID.
2. **Priority Queue / Queue** - `EmergencyQueue.java`
   * First-Come, First-Served (FCFS) triage queue for handling emergency admissions.
3. **Stack (LIFO)** - `TreatmentStack.java` & `Treatment.java`
   * Tracks patient medical treatments, allowing easy rollback or history review.
4. **Singly Linked List** - `PatientVisitHistory.java` & `VisitNode.java`
   * Maintains a dynamic sequential log of patient medical visit records.

---

## 🚀 How to Run

1. Clone or download this repository.
2. Open the project in **Eclipse IDE** or any Java IDE.
3. Ensure Java JDK 8 or higher is installed.
4. Run `Main.java` as a **Java Application**.

---

## 📊 Sample Operations Tested in `Main.java`

* **Patient Management:** Add, search, and list patient details via BST.
* **Triage Queue:** Enqueue incoming emergency patients and dequeue for doctor allocation.
* **Treatment Tracking:** Push treatment records to the stack and pop during review.
* **Visit Logs:** Add, search, delete, and display linked list visit records.
