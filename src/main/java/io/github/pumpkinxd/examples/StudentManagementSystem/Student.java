package io.github.pumpkinxd.examples.StudentManagementSystem;


public class Student  {
    String name;
    short age;
    String home;
    long id;

    public Student(String name, short age, String home,long id) {
        this.name = name;
        this.age = age;
        this.home = home;
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
