package assignment2;


/*
 * Class: CMSC203 
 * Instructor: Grigoriy A. Grinberg
 * Description: The Procedure class represents a procedure being performed on a patient. It has several getters and setters for attributes.
 * Due: 07/23/2024
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Afor Njoh
*/
public class Procedure {
    // Fields
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    // No-arg constructor
    public Procedure() {
        this.procedureName = "";
        this.procedureDate = "";
        this.practitionerName = "";
        this.procedureCharges = 0.0;
    }

    // Parametrized constructor for name and date
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = "";
        this.procedureCharges = 0.0;
    }

    // Parametrized constructor for all attributes
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }

    // Accessors (getters)
    public String getProcedureName() {
        return procedureName;
    }

    public String getProcedureDate() {
        return procedureDate;
    }

    public String getPractitionerName() {
        return practitionerName;
    }

    public double getProcedureCharges() {
        return procedureCharges;
    }

    // Mutators (setters)
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }

    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }

    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }

    public void setProcedureCharges(double procedureCharges) {
        this.procedureCharges = procedureCharges;
    }

    // toString method
    @Override
    public String toString() {
        return "Procedure Information:\n" +
                "Procedure Name: " + procedureName + "\n" +
                "Procedure Date: " + procedureDate + "\n" +
                "Practitioner Name: " + practitionerName + "\n" +
                "Procedure Charges: $" + procedureCharges;
    }
}
