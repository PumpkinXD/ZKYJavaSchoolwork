package io.github.pumpkinxd.examples.company;

public class HourlyEmployee extends Employee {
    private int WorkedHours;
    private int WagePerHour;

    @Override
    public int getSalary(int month) {
        return (WorkedHours*WagePerHour)+super.getSalary(month);
    }

    public HourlyEmployee(int birthMonth, String name, int workedHours, int wagePerHour) {
        super(birthMonth, name);
        WorkedHours = workedHours;
        WagePerHour = wagePerHour;
    }
}
