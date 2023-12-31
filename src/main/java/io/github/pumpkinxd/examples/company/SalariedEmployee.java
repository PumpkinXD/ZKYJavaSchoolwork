package io.github.pumpkinxd.examples.company;

public class SalariedEmployee extends Employee {

    private int SalaryPerMonth;
    @Override
    public int getSalary(int month) {
        return SalaryPerMonth+super.getSalary(month);
    }

    @Override
    public String getEmployeeType() {
        return "月薪工";
    }

    public SalariedEmployee(int birthMonth, String name, int salaryPerMonth) {
        super(birthMonth, name);
        SalaryPerMonth = salaryPerMonth;
    }
}
