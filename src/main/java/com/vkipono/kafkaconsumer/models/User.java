package com.vkipono.kafkaconsumer.models;

public class User {
    private String firstName;
    private String lastName;
    private String dept;
    private Long salary;

//    { "firstName":"Kiprono", "lastName":"Vincent", "dept":"Technology", "salary":120000L}
//    { "firstName":"Shaki", "lastName":"Cheki", "dept":"HR", "salary":100000L}

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public User(String firstName, String lastName, String dept, Long salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dept = dept;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                '}';
    }
}
