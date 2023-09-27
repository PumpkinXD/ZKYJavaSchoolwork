package io.github.pumpkinxd.examples.company;

public class HourlyEmployee extends Employee {
    private int WorkedHours;
    private int WagePerHour;

    @Override
    public int getSalary(int month) {

        return WorkedHours <= 160 ?
                (WorkedHours * WagePerHour) + super.getSalary(month) :
                (int) (160 * WagePerHour + 1.5 * WagePerHour * (WorkedHours - 160));
    }

    @Override
    public String getEmployeeType() {
        return "小时工";
    }

    public HourlyEmployee(int birthMonth, String name, int workedHours, int wagePerHour) {
        super(birthMonth, name);
        WorkedHours = workedHours;
        WagePerHour = wagePerHour;
    }
}
