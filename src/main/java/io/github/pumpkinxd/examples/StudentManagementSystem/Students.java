package io.github.pumpkinxd.examples.StudentManagementSystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Students {
    Map<Long,Student> studentMap;

    public Students() {
        studentMap=new HashMap<>();
    }

    public Students(long id, Student stu) {
        studentMap=new HashMap<>();
        studentMap.put(id,stu);
    }
    public boolean addStudent(long id,String name,short age,String home){
        if (studentMap.containsKey(id)){return false;}
        else {
            studentMap.put(id,new Student(name,age,home,id));
            return true;
        }
    }
    public boolean removeStudentByID(long id){
        if(studentMap.containsKey(id)){
            studentMap.remove(id);
            return true;
        }
        return false;
    }
    public boolean modifyStudentByID(long id,String name,short age,String home){
        if (studentMap.containsKey(id)) {
            studentMap.put(id,new Student(name,age,home,id));
            return true;
        }
        return false;
    }
    public Student getAStudent(long id)
    {
        if (studentMap.containsKey(id)) {
            return studentMap.get(id);
        }
        return null;
    }
    public String queryAll(){
        StringBuilder stringBuilder=new StringBuilder();
        for (Student stu : studentMap.values()) {
            stringBuilder.append("ID:").append(stu.getId()).append("\nname:").append(stu.getName()).append("\nHome address:").append(stu.getHome()).append("\nage:").append(stu.getAge()).append('\n');
        }
        return stringBuilder.toString();
    }

}
