package hospital;

import java.util.Stack;

public class TreatmentStack {

    private Stack<Treatment> stack;

    public TreatmentStack() {
        stack = new Stack<>();
    }

    // Push treatment
    public void push(Treatment treatment) {
        stack.push(treatment);

        System.out.println("Treatment added to history.");
    }

    // Pop latest treatment
    public Treatment pop() {

        if (stack.isEmpty()) {
            System.out.println("Treatment history is empty.");
            return null;
        }

        Treatment treatment = stack.pop();

        System.out.println("Latest treatment removed from history.");

        return treatment;
    }

    // Display treatment history
    public void displayHistory() {

        if (stack.isEmpty()) {
            System.out.println("Treatment history is empty.");
            return;
        }

        System.out.println("=== TREATMENT HISTORY ===");

        for (Treatment treatment : stack) {
            treatment.displayTreatment();
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}