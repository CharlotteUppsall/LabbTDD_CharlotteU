import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestEmployeeInfo {

    EmployeeInfo testObject1 = new EmployeeInfo("Charlie", "Uppsall", 33, 26500);

    @Test
    public void testGetEmployeeFirstName(){
        String expected = "Charlie";
        String actual = testObject1.getFirstName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeLastName(){
        String expected = "Uppsall";
        String actual = testObject1.getLastName();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeAge(){
        int expected = 33;
        int actual = testObject1.getAge();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetEmployeeSalary(){
        double expected = 26500;
        double actual = testObject1.getEmployeeSalary();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetUniqeID_of_EmployeeOne(){
        int actual = testObject1.getUniqeEmployeeID();
        int expected = 1;

        assertEquals(expected, actual);

    }

}
