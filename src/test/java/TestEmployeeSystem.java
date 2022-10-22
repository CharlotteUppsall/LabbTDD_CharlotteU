import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestEmployeeSystem {

    @Test
    public void showEmployeeSystemList(){
        EmployeeSystem systemTestObject = new EmployeeSystem();

        ArrayList<EmployeeInfo> employeeList = new ArrayList<>();
        int expected = 2;

        employeeList = systemTestObject.getListOfEmployees();

        int actual = employeeList.size();
    }
}
