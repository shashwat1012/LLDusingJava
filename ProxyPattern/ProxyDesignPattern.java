package ProxyPattern;

public class ProxyDesignPattern {
    
    public static void main(String[] args) {
        
        EmployeeDao adminDao = new EmployeeDaoProxy("ADMIN");
        Employee emp1 = new Employee(0, "Lorem");
        Employee emp2 = new Employee(1, "Dolor");

        adminDao.create(emp1);
        adminDao.create(emp2);
        adminDao.get(0);
        adminDao.delete(0);

        EmployeeDao userDao = new EmployeeDaoProxy("USER");
        userDao.create(new Employee(2,"Batman"));
        adminDao.get(1);
        userDao.get(1);
    }
}
