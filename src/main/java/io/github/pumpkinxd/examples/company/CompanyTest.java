package io.github.pumpkinxd.examples.company;

import java.util.Calendar;
import java.util.Random;

public interface CompanyTest {
    public static void main(String[] args) {
        Random r=new Random();
        Calendar calendar=Calendar.getInstance();
        Employee[] employees=new Employee[r.nextInt(10,30)];
        for (Employee employee:employees) {
            employee=EmployeeFactory.generate();
            System.out.println(
                    "姓名:"
                    +employee.getName()
                    +"\n工种:"
                    +employee.getEmployeeType()
                    +"\n本月工资:"
                    +employee.getSalary(calendar.get(Calendar.MONTH)+1) + "元\n"
            );
        }
    }
}
