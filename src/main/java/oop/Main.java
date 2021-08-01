package oop;

public class Main {
    public static void main(String[] args) {
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov", "Ivan", "Engineer", "ivivan@gmail.com", 865322288, 10000, 25);
        employeesArray[1] = new Employee("Petrov", "Ivan", "Chief", "petiv@gmail.com", 865332288, 20000, 23);
        employeesArray[2] = new Employee("Nikitin", "Nikita", "Engineer", "niknik@gmail.com", 865332282, 15000, 26);
        employeesArray[3] = new Employee("Alexandrov", "Alex", "Engineer", "alal@gmail.com", 165332282, 16000, 41);
        employeesArray[4] = new Employee("Mihailov", "Mihail", "Engineer", "mm@gmail.com", 265332282, 17000, 29);

        for (Employee employee : employeesArray) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }

    }
}
