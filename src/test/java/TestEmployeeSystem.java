import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestEmployeeSystem {

    EmployeeSystem testObject_system;

    EmployeeInfo testObject_employee1;
    EmployeeInfo testObject_employee2;
    EmployeeInfo testObject_employee3;

    @BeforeEach
    public void setUp(){
        testObject_employee1 = new EmployeeInfo("Hermione", "Granger", 33, 30500);
        testObject_employee2 = new EmployeeInfo("Harry", "Potter", 32, 31400);
        testObject_employee3 = new EmployeeInfo("Ron", "Weasley", 33, 30500);
    }

    @Test
    public void testAddEmployeeToList() {

        testObject_employee1 = new EmployeeInfo();

        testObject_system.addEmployeeToList(testObject_employee1);
        testObject_system.addEmployeeToList(testObject_employee2);
        testObject_system.addEmployeeToList(testObject_employee3);

        ArrayList<EmployeeInfo> listOfEmployees = testObject_system.getListOfEmployees();

        Assertions.assertEquals(3, listOfEmployees.size());

    }

    @Test
    public void testRemoveEmployeeFromList(){
        testObject_employee1 = new EmployeeInfo();

        testObject_system.addEmployeeToList(testObject_employee1);
        testObject_system.removeEmployeeFromList(testObject_employee1);

        ArrayList<EmployeeInfo> listOfEmployees = testObject_system.getListOfEmployees();

        Assertions.assertTrue(listOfEmployees.size() == 0);

    }

}