import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestEmployeeSystem {

    EmployeeInfo testObject_employee1;
    EmployeeInfo testObject_employee2;

    @Test
    public void testAddEmployeeToList() {
        EmployeeSystem testObject_System = new EmployeeSystem();
        testObject_employee1 = new EmployeeInfo("Hermione", "Granger", 33, 30500);
        testObject_employee2 = new EmployeeInfo("Harry", "Potter", 32, 31400);

        testObject_System.addEmployeeToList(testObject_employee1);
        testObject_System.addEmployeeToList(testObject_employee2);

        ArrayList<EmployeeInfo> listOfEmployees = testObject_System.getListOfEmployee();



    }
}
