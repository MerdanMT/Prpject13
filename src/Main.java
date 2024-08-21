import serviceImpl.EmployeeServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        employeeService.updateAdVeVezife(1,"Eli","Doktor");
        System.out.println(employeeService.getAll());
    }
}