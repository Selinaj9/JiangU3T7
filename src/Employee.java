public class Employee {
    private static int mostRecentEmployeeID;
    private static int totalEmployeesCreated = 0;
    private String firstName;
    private String lastName;
    private int ID;

    public Employee(String first, String last) {
        totalEmployeesCreated++;
        firstName = first;
        lastName = last;
        ID = 100 + totalEmployeesCreated - 1;
        mostRecentEmployeeID = ID;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getID() {
        return ID;
    }

    public static int getMostRecentEmployeeID() {
        return mostRecentEmployeeID;
    }

    public static int getTotalEmployeesCreated() {
        return totalEmployeesCreated;
    }

    public String employeeInfo() {
        return "--------------------------" + "\nEmployee full name: " + getFullName() + "\nEmployee ID: " + getID() + "\nMost recent ID assigned: " + getMostRecentEmployeeID() + "\nTotal employees hired: " + getTotalEmployeesCreated() + "\n--------------------------";
    }
}