package prototype;

public class MainPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {

        MyPrototype myPrototype = new MyPrototype();
        Employee employee1 = new Employee("Smith Darrel", "manager", 1500);
        myPrototype.setEmployee(employee1);
        Employee employee2 = myPrototype.getEmployee();

        System.out.println("Employee1: " + employee1.toString());
        System.out.println("----------------------------------");
        System.out.println("Employee2: " + employee2.toString());
        System.out.println("----------------------------------");
        System.out.println("Equals for employee 1 and employee2: " + employee1.equals(employee2));
    }
}


