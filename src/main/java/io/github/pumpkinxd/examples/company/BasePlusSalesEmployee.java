package io.github.pumpkinxd.examples.company;

public class BasePlusSalesEmployee extends SalesEmployee{
    private int BasicSalary;


    @Override
    public int getSalary(int month) {
        return BasicSalary+super.getSalary(month);
    }

    public BasePlusSalesEmployee(int birthMonth, String name, int saleAmount, int commissionRate, int basicSalary) {
        super(birthMonth, name, saleAmount, commissionRate);
        BasicSalary = basicSalary;
    }
}
