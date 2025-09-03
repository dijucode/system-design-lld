package proxydesignpattern;

public class EmployeeDAOProxy implements EmployeeDAO{

    EmployeeDAO employeeDAO;
    public EmployeeDAOProxy() {
        this.employeeDAO = new EmployeeDAOImpl();
    }

    @Override
    public void createEmployee(String client, Employee emp) throws Exception {
        if("admin".equals(client)){
            employeeDAO.createEmployee(client, emp);
        } else {
            throw new Exception("Unauthorized access");
        }
    }
    @Override
    public void updateEmployee(String client, Employee emp) throws Exception {
        if ("admin".equals(client)) {
            employeeDAO.updateEmployee(client, emp);
        } else {
            throw new Exception("Unauthorized access");
        }
    }
    @Override
    public Employee getEmployee(String client, int empId) throws Exception {
        if ("admin".equals(client) || "user".equals(client)) {
            return employeeDAO.getEmployee(client, empId);
        } else {
            throw new Exception("Unauthorized access");
        }
    }


}
