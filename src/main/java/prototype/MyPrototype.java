package prototype;

public class MyPrototype {

    private Employee employee;

    public Employee getEmployee() throws CloneNotSupportedException {
        return employee.clone();
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}

