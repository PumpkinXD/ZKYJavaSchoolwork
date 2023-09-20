package io.github.pumpkinxd.examples;

import java.util.*;
/***
 * @author PumpkinXD
 * @since jdk17
 */
public class Student {
    private int uid;
    private String name;
    enum Sex{
        FEMALE,
        MALE,
        UNKNOWN;
    }

    private Sex sex;

    private short age;

    private short scoreofjava;

    public String getName() {
        return name;
    }

    public int getUid() {
        return uid;
    }

    public Sex getSex() {
        return this.sex;
    }

    public int getSexIntVal() {
        return this.sex.ordinal();
    }

    /***
     * @return sex of the student (in zh_hans)
     */
    public String getSexStringZhHans() {
        switch (this.sex){
            case MALE: return "男";
            case FEMALE: return "女";
            default: return "未知";
        }
    }

    public short getAge() {
        return age;
    }

    public short getScoreofjava() {
        return scoreofjava;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(int sex) {
        this.sex = Sex.values()[sex];
    }

    public void setAge(short age) {
        this.age = age;
    }

    public void setScoreofjava(short scoreofjava) {
        this.scoreofjava = scoreofjava;
    }


    public Student(int uid, String name, int sex, short age, short scoreofjava) {
        this.uid = uid;
        this.name = name;
        this.sex = Sex.values()[sex];
        this.age = age;
        this.scoreofjava = scoreofjava;
    }

    public static void main(String[] args) {
        final int FIVEIS5=5;
        Student fivestudents[]=new Student[FIVEIS5];

        Random r=new Random();
        for (int i = 0; i < FIVEIS5; i++) {
            fivestudents[i]=new Student(i+10000,
                    "测试名称"+i,
                    r.nextInt(0,1),
                    (short) r.nextInt(18,26),
                    (short)r.nextInt(0,100)
            );
        }
        short highestSC,lowestSC,avgSC;
        Comparator<Student> studentComparator=Comparator.comparingInt(Student::getScoreofjava);
        highestSC=Collections.max(Arrays.asList(fivestudents),studentComparator).getScoreofjava();
        lowestSC=Collections.min(Arrays.asList(fivestudents),studentComparator).getScoreofjava();
        short sumOfSC=0;
        for (int i = 0; i < FIVEIS5; i++) {
            System.out.println("姓名: " +fivestudents[i].getName()
                    +"\n学号: "+fivestudents[i].getUid()
                    +"\n年龄: "+fivestudents[i].getAge()
                    +"\n性别: "+fivestudents[i].getSexStringZhHans()
                    +"\nJava课程成绩: "+fivestudents[i].getScoreofjava()
            );
        sumOfSC+=fivestudents[i].getScoreofjava();
        }
        System.out.println(
                "学生分数最高分: "+highestSC
                +"\n学生分数最低分: "+lowestSC
                +"\n学生分数平均分: "+(sumOfSC/FIVEIS5)
                );
    }
}