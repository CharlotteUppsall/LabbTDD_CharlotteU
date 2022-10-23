import org.junit.jupiter.api.*;

import java.util.ArrayList;

public class TestEmployeeSystem {

    EmployeeSystem testObject_system;

    EmployeeInfo testObject_employee1;
    EmployeeInfo testObject_employee2;
    EmployeeInfo testObject_employee3;

    @BeforeEach
    public void setUp(){
        testObject_employee1 = new EmployeeInfo("Sirius", "Black", 33, 32500);
        testObject_employee2 = new EmployeeInfo("Remus", "Lupin", 32, 31400);
        testObject_employee3 = new EmployeeInfo("Alastor", "Moody", 46, 36500);
    }

    @AfterEach
    public void afterEach(TestInfo testInfo) {
        System.out.println("Executed testcase: " + testInfo.getDisplayName());
    }


    @Test
    public void testAddEmployeesToList() {
        testObject_system = new EmployeeSystem();

        testObject_system.addEmployeeToList(testObject_employee1);
        testObject_system.addEmployeeToList(testObject_employee2);
        testObject_system.addEmployeeToList(testObject_employee3);

        ArrayList<EmployeeInfo> listOfEmployees = testObject_system.getListOfEmployees();

        Assertions.assertEquals(3, listOfEmployees.size());
    }

    @Test
    public void testRemoveEmployeeFromList(){
        testObject_system = new EmployeeSystem();
        ArrayList<EmployeeInfo> listOfEmployees = testObject_system.getListOfEmployees();

        testObject_system.addEmployeeToList(testObject_employee1);
        testObject_system.removeEmployeeFromList(testObject_employee1);
        Assertions.assertTrue(listOfEmployees.size() == 0);


        testObject_system.addEmployeeToList(testObject_employee2);
        testObject_system.addEmployeeToList(testObject_employee3);
        testObject_system.removeEmployeeFromList(testObject_employee2);
        Assertions.assertTrue(listOfEmployees.size() == 1);

    }

}