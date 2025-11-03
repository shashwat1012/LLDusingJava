package ProxyPattern;

import java.util.*;

public class EmployeeDaoImpl implements EmployeeDao{
    /*
     * marking the hashmap as static since every instance of the realDao and proxyDao should access the same employeeDB object
     * not a good practice for production level design, use a singleton instead, single shared instance to be used by all dao instances
     * Or dependency injection approach
     */
    static Map<Integer,Employee> employeeDB = new HashMap<>();

    @Override
    public void create(Employee emp) {
        employeeDB.put(emp.getId(),emp);
        System.out.println("[EmployeeDaoImpl] Employee created: " + emp);
    }

    @Override
    public void delete(int empId) {
        Employee removed = employeeDB.remove(empId);
        if(removed != null) {
            System.out.println("[EmployeeDaoImpl] Employee deleted: " + removed);
        } else {
            System.out.println("[EmployeeDaoImpl] No employee found with id: " + empId);
        }
    }

    @Override
    public Employee get(int empId) {
        Employee emp = employeeDB.get(empId);
        if (emp == null) {
            System.out.println("[EmployeeDaoImpl] No employee found with ID " + empId);
        } else {
            System.out.println("[EmployeeDaoImpl] Fetched employee: " + emp);
        }
        return emp;
    }
}
