package assignment2;

import java.util.Scanner;

/*
 * Class: CMSC203 
 * Instructor: Grigoriy A. Grinberg
 * Description: The PatientDriverApp class orchestrates instances of the Patient and Procedure classes to print out a summary of the patient's charge.
 * Due: 07/23/2024
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Afor Njoh
*/
public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a patient object initialized with user input
        Patient patient = createPatient(scanner);

        // Create three instances of the Procedure class
        Procedure procedure1 = createProcedure1();
        Procedure procedure2 = createProcedure2();
        Procedure procedure3 = createProcedure3();

        // Display patient information
        displayPatient(patient);

        // Display information about all three procedures
        displayProcedure(procedure1);
        displayProcedure(procedure2);
        displayProcedure(procedure3);

        // Calculate total charges of the three procedures
        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);

        // Display total charges with two decimal points
        System.out.printf("Total Charges: $%.2f%n", totalCharges);
        System.out.println("The program was developed by a Student: Afor Njoh 07/23/24");

        // Close the scanner
        scanner.close();
    }

    // Method to create a Patient object with user input
    public static Patient createPatient(Scanner scanner) {
        System.out.println("Enter patient information:");

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Street Address: ");
        String streetAddress = scanner.nextLine();

        System.out.print("City: ");
        String city = scanner.nextLine();

        System.out.print("State: ");
        String state = scanner.nextLine();

        System.out.print("ZIP Code: ");
        String zipCode = scanner.nextLine();

        System.out.print("Phone Number (e.g., 301-123-4567): ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Emergency Contact Name: ");
        String emergencyContactName = scanner.nextLine();

        System.out.print("Emergency Contact Phone Number: ");
        String emergencyContactPhone = scanner.nextLine();

        // Create and return the Patient object
        return new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone);
    }

    // Method to create Procedure instance using constructor 1
    public static Procedure createProcedure1() {
        return new Procedure("X-Ray", "06/15/2023");
    }

    // Method to create Procedure instance using constructor 2
    public static Procedure createProcedure2() {
        Procedure procedure = new Procedure("Blood Test", "06/20/2023", "Dr. Smith", 150.0);
        return procedure;
    }

    // Method to create Procedure instance using constructor 3
    public static Procedure createProcedure3() {
        Procedure procedure = new Procedure();
        procedure.setProcedureName("MRI");
        procedure.setProcedureDate("06/25/2023");
        procedure.setPractitionerName("Dr. Johnson");
        procedure.setProcedureCharges(300.0);
        return procedure;
    }

    // Method to display patient information
    public static void displayPatient(Patient patient) {
        System.out.println("\nPatient Information:");
        System.out.println("Full Name: " + patient.buildFullName());
        System.out.println("Address: " + patient.buildAddress());
        System.out.println("Phone Number: " + patient.getPhoneNumber());
        System.out.println("Emergency Contact: " + patient.buildEmergencyContact());
    }

    // Method to display procedure information
    public static void displayProcedure(Procedure procedure) {
        System.out.println("\nProcedure Information:");
        System.out.println("Procedure Name: " + procedure.getProcedureName());
        System.out.println("Procedure Date: " + procedure.getProcedureDate());
        System.out.println("Practitioner Name: " + procedure.getPractitionerName());
        System.out.printf("Procedure Charges: $%.2f%n", procedure.getProcedureCharges());
    }

    // Method to calculate total charges of three procedures
    public static double calculateTotalCharges(Procedure procedure1, Procedure procedure2, Procedure procedure3) {
        double totalCharges = procedure1.getProcedureCharges() + procedure2.getProcedureCharges() + procedure3.getProcedureCharges();
        return totalCharges;
    }
}
