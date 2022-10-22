import org.junit.jupiter.api.Test;

public class TestEmployeeSystem {

    EmployeeInfo testObject_employee1;

    @Test
    public void testAddEmployeeToList() {
        EmployeeSystem testObject_System = new EmployeeSystem();

        testObject_employee1 = new EmployeeInfo("Hermione", "Granger", 33, 30500);

        testObject_System.addEmployeeToList();
    }
}
