package HW5;

public class Main {

    public static void main(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("petr I", "Engineer", "dd@md.com", "01", 30000, 60);
        empArray[1] = new Employee("Petr 2", "Driver", "5a@aa.com", "02", 200, 35);
        empArray[2] = new Employee("Petr 3", "Driver 1", "3a@aa.com", "03", 300, 35);
        empArray[3] = new Employee("Petr 4", "Driver 2 ", "1a@aa.com", "04", 400, 41);
        empArray[4] = new Employee("Petr 5", "Drive 2r", "2a@aa.com", "05", 500, 42);

        for (int i = 0; i <empArray.length ; i++) {
            if(empArray[i].getAge()>40){
                empArray[i].employeeInfo();
            }
        }
    }
}
