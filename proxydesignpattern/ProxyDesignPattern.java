package proxydesignpattern;

public class ProxyDesignPattern {

    public static void main(String[] args) {
        try {
            EmployeeDAO employeeDAO = new EmployeeDAOProxy();

            Employee emp1 = new Employee(1, "Alice");
            Employee emp2 = new Employee(2, "Bob");

            // Admin client
            String adminClient = "admin";
            employeeDAO.createEmployee(adminClient, emp1);
            employeeDAO.updateEmployee(adminClient, emp2);
            System.out.println(employeeDAO.getEmployee(adminClient, 1));

            // User client
            String userClient = "user";
            System.out.println(employeeDAO.getEmployee(userClient, 2));

            // Unauthorized client
            String guestClient = "guest";
            try {
                employeeDAO.createEmployee(guestClient, emp1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
