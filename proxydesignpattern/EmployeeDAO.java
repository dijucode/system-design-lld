package proxydesignpattern;

public interface EmployeeDAO {

    public void createEmployee(String client, Employee emp) throws Exception;

    public void updateEmployee(String client, Employee emp) throws Exception;

    public Employee getEmployee(String client, int empId) throws Exception;
}
