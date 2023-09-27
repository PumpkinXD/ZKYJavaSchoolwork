package io.github.pumpkinxd.examples.company;

public class BasePlusSalesEmployee extends SalesEmployee{
    private int BasicSalary;


    @Override
    public int getSalary(int month) {
        return BasicSalary+super.getSalary(month);
    }

    @Override
    public String getEmployeeType() {
        return "有底薪的销售";
    }

    public BasePlusSalesEmployee(int birthMonth, String name, int saleAmount, double commissionRate, int basicSalary) {
        super(birthMonth, name, saleAmount, commissionRate);
        BasicSalary = basicSalary;
    }
}
