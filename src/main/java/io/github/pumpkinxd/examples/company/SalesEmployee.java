package io.github.pumpkinxd.examples.company;

public class SalesEmployee extends Employee {
    protected int SaleAmount;
    protected double CommissionRate;

    @Override
    public int getSalary(int month) {
        return ((int)(SaleAmount*(1+CommissionRate)))+super.getSalary(month);
    }

    @Override
    public String getEmployeeType() {
        return "销售";
    }

    public SalesEmployee(int birthMonth, String name, int saleAmount, double commissionRate) {
        super(birthMonth, name);
        SaleAmount = saleAmount;
        CommissionRate = commissionRate;
    }
}
