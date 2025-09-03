package proxydesignpattern;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void createEmployee(String client, Employee emp) throws Exception {
        System.out.println("Employee created: " + emp);
    }
    @Override
    public void updateEmployee(String client, Employee emp) throws Exception {
        System.out.println("Employee updated: " + emp);

    }
    @Override
    public Employee getEmployee(String client, int empId) throws Exception {
//        need to return Employee Details by employee id
        return new Employee(empId, "Dummy Name");

    }



}
