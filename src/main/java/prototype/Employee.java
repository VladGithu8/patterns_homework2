package prototype;

public class Employee implements Cloneable {

    private String nameSurname;
    private String position;
    private double salary;

    public Employee(String nameSurname, String position, double salary) {
        this.nameSurname = nameSurname;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee" +
                "\nName surname: " + nameSurname +
                "\nPosition: " + position +
                "\nSalary: " + salary;
    }
}
