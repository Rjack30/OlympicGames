package CustomException;

public class EmployeeManager {

    public Employee find(String employeeID) throws EmployeeNotFoundException {
        if (employeeID.equals("179456")) {
            return new employee();
        } else {
            throw new EmployeeNotFoundException(
                    "Could not find student with ID " + employeeID);
        }
    }

    private static class employee extends Employee {
    }
}
