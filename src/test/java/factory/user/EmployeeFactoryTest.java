package factory.user;

import domain.user.Employee;
import factory.user.EmployeeFactory;
import org.junit.Assert;
import org.junit.Test;

public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {

        Employee employee = EmployeeFactory.getEmployee(1, "Ismail", "Vardien");
        Assert.assertNotNull(employee);

    }
}