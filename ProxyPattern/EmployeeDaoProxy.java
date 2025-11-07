package ProxyPattern;


public class EmployeeDaoProxy implements EmployeeDao {
    boolean isAdmin;
    EmployeeDaoImpl realDao;

    public EmployeeDaoProxy(String userRole) {
        this.isAdmin = userRole.equalsIgnoreCase("ADMIN");
        this.realDao = new EmployeeDaoImpl();
    }

    @Override
    public void create(Employee emp) {
        if(isAdmin) {
            realDao.create(emp);
        } else {
            System.out.println("[Proxy] Access Denied: Only admin can create employees.");
        }
    }

    @Override
    public void delete(int empId) {
        if(isAdmin) {
            realDao.delete(empId);
        } else {
            System.out.println("[Proxy] Access Denied: Only admin can delete employees.");
        }
    }

    @Override
    public Employee get(int empId) {
        System.out.println("[Proxy] Accessing employee details...");
        return realDao.get(empId);
    }
}
