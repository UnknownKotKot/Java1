package HW5;

public class Employee {
    private String name;
    private String role;
    private String eMail;
    private String telNumber;
    private int salary;
    private int age;

    public Employee(String name, String role, String eMail, String telNumber, int salary, int age ){
    this.name = name;
    this.role = role;
    this.eMail = eMail;
    this.telNumber = telNumber;
    this.salary = salary;
    this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void employeeInfo(){
        System.out.println(name + ", " + role + ", " + eMail + ", " + telNumber + ", " + salary + ", " + age + "." );
    }
}
