package CustomException;

public class Employee {

    protected static class  EmployeeDetails {
        //Creating properties of Employee class
        int emp_id, salary;
        String name, address, department, email;

        public void setEmp_id(int emp_id) {
            this.emp_id = emp_id;
        }
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        //Overriding toString() method
        @Override
        public String toString() {
            return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + ", address = " + address
                    + ", department = " + department + ", email = " + email + "]";
        }

    }
    //Creating main class
    public class EmployeeOlympicGames{
        //main() method start
        public void main(String args[]) {

            //Creating object of EmployeeDetails class
            EmployeeDetails emp = new EmployeeDetails();
            //Setting values to the properties
            emp.setEmp_id(131);
            emp.setName("Robert Jackson");
            emp.setDepartment("IT");
            emp.setSalary(15000);
            emp.setAddress("Los Angeles");
            emp.setEmail("Rjblahhblahh@gmail.com");

            //Showing Employee details
            System.out.println(emp);

            //Getting salary using getter
            int sal = emp.getSalary();
            int increment = 0;
            //Incrementing salary based on condition
            if ((sal >=1000) && (sal <=1500))
            {
                //incrementing salary 2%
                increment += (sal * 2)/100;
                sal = sal+increment;

                emp.setSalary(sal);
                System.out.println("\n Salary is incremented \n");
                System.out.println(emp);

            }else if ((sal >=1500) && (sal <=20000)){
                //incrementing salary 5%
                increment += (sal * 5)/100;
                sal = sal+increment;

                emp.setSalary(sal);
                System.out.println("\n Salary is incremented \n");
                System.out.println(emp);
            }else {
                System.out.println("\n Salary is not incremented \n");
                System.out.println(emp);
            }
        }
    }





}
