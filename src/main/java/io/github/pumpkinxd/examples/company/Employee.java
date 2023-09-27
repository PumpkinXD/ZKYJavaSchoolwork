package io.github.pumpkinxd.examples.company;

public abstract class Employee {

    public Employee(int birthMonth, String name) {
        this.birthMonth = birthMonth;
        this.name = name;
    }

    public int getSalary(int month){return (month==this.birthMonth ?0:100);}
    public String getName(){return name;}
    public abstract String getEmployeeType();
    protected int birthMonth;
    protected String name;
}
