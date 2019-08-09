package service.user;

import domain.user.Employee;
import service.Service;

import java.util.Set;

public interface EmployeeService extends Service<Employee, Integer> {

    Set<Employee> getAll();

}
