package io.github.pumpkinxd.examples.company;


import java.util.Random;
import java.util.UUID;

/***
 * generate random Employee instances
 */
public class EmployeeFactory {

    /***
     *
     * @return a PRNGed Employee instance
     * @since 17
     */
    static Employee generate(){
        Random r=new Random();
        return switch (r.nextInt(0,4)) {
            case 0 -> new HourlyEmployee(
                    r.nextInt(1, 13),
                    "测试名称 " + UUID.randomUUID().toString(),
                    r.nextInt(16, 36),
                    80
            );
            case 1 -> new SalesEmployee(
                    r.nextInt(1, 13),
                    "测试名称 " + UUID.randomUUID().toString(),
                    r.nextInt(0,114514),
                    0.15
            );
            case 2 -> new BasePlusSalesEmployee(
                    r.nextInt(1, 13),
                    "测试名称 " + UUID.randomUUID().toString(),
                    r.nextInt(0,65535),
                    0.25,
                    3000
            );
            case 3 -> new SalariedEmployee(
                    r.nextInt(1, 13),
                    "测试名称 " + UUID.randomUUID().toString(),
                    6000
            );
            default -> null;
        };


    }
}
