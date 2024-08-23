import serviceImpl.EmployeeServiceImpl;
import serviceImpl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.prefiksFilt("+99410"));
    }
}