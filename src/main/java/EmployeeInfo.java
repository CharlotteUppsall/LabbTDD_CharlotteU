public class EmployeeInfo {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private int uniqeEmployeeID;
    private static int autoGeneratedID;

    public EmployeeInfo(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        autoGeneratedID++;
        uniqeEmployeeID = autoGeneratedID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getEmployeeSalary() {
        return salary;
    }

    public int getUniqeEmployeeID() {
        return uniqeEmployeeID;
    }
}

