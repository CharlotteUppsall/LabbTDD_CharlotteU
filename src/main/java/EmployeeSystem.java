import java.util.ArrayList;

public class EmployeeSystem {

    ArrayList<EmployeeInfo> listOfEmployees = new ArrayList<>();

    public ArrayList<EmployeeInfo> getListOfEmployees() {
        return listOfEmployees;
    }

    public void addEmployeeToList(EmployeeInfo testObject){
        listOfEmployees.add(testObject);
    }

    public void removeEmployeeFromList(EmployeeInfo testObject){
        listOfEmployees.remove(testObject);
    }
}
