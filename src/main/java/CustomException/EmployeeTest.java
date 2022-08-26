package CustomException;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeManager manager;
        manager = new EmployeeManager();

        try {

            Employee employees = manager.find("0000001");

        } catch (EmployeeNotFoundException ex) {
            System.err.print(ex);
        }
    }

}
