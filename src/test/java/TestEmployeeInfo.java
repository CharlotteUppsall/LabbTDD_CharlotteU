import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestEmployeeInfo {

    EmployeeInfo testObject1 = new EmployeeInfo("Charlie", "Uppsall", 33, 26500);

    @Test
    public void testGetEmployeeFirstName(){
        String expected = "Charlie";
        String actual = testObject1.getFirstName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeLastName(){
        String expected = "Uppsall";
        String actual = testObject1.getLastName();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeAge(){
        int expected = 33;
        int actual = testObject1.getAge();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeSalary(){
        double expected = 26500;
        double actual = testObject1.getEmployeeSalary();

        Assertions.assertEquals(expected, actual);
    }
}
