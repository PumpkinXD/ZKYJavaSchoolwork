package io.github.pumpkinxd.examples.company;

public class SalesEmployee extends Employee {
    protected int SaleAmount;
    protected int CommissionRate;

    @Override
    public int getSalary(int month) {
        return (SaleAmount*(1+CommissionRate))+super.getSalary(month);
    }

    public SalesEmployee(int birthMonth, String name, int saleAmount, int commissionRate) {
        super(birthMonth, name);
        SaleAmount = saleAmount;
        CommissionRate = commissionRate;
    }
}
