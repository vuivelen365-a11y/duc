import java.util.Scanner; // 1. Import library for user input

public class BMI_Calculator {

    // 2. Main method – program starts here
    public static void main(String[] args) {

        // Create Scanner object to read input from keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== BASIC BMI CALCULATOR PROGRAM ===");

        // --- STEP 1: INPUT DATA ---
        System.out.print("Please enter your full name: ");
        String fullName = scanner.nextLine(); // Input text

        System.out.print("Please enter your weight (kg): ");
        double weight = scanner.nextDouble(); // Input decimal number

        System.out.print("Please enter your height (m): ");
        double height = scanner.nextDouble(); // Input decimal number

        // --- STEP 2: CALCULATION ---
        // BMI formula: weight / (height * height)
        double bmi = weight / (height * height);

        // --- STEP 3: OUTPUT RESULT ---
        System.out.println("\n---------------------------------");
        System.out.println("Hello: " + fullName);
        // %.2f rounds the result to 2 decimal places
        System.out.printf("Your BMI value is: %.2f%n", bmi);

        // --- STEP 4: CONDITIONAL STATEMENT ---
        if (bmi < 18.5) {
            System.out.println("Assessment: Underweight.");
        } else if (bmi < 25) {
            System.out.println("Assessment: Normal weight.");
        } else {
            System.out.println("Assessment: Overweight.");
        }

        // Close scanner to free resources
        scanner.close();
    }
}
