package oop;

public class Employee {
    private String firstName;
    private String lastName;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;


    public int getAge() {
        return age;
    }

    public Employee(String firstName, String lastName, String position, String email, long phone, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(position);
        System.out.println(age);
    }

}
