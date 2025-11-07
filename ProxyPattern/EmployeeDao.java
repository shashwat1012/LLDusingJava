package ProxyPattern;

public interface EmployeeDao {
    public void create(Employee emp);
    public void delete(int empId);
    public Employee get(int empId);
}
