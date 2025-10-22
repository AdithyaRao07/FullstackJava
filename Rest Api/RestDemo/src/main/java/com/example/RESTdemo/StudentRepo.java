package com.example.RESTdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {
    List<Student> Students;
    public StudentRepo(){
         Students=new ArrayList<>();
        Student s1=new Student();
        s1.setsName("Adithya");
        s1.setsId(1);
        Student s2=new Student();
        s2.setsName("Ajay");
        s2.setsId(2);
        Students.add(s1);
        Students.add(s2);
    }
    public List<Student> getStudentsRepo(){
        return Students;
    }
    public void create(Student s1){
        Students.add(s1);
    }
    public Student getStudent(int sId){
        for (Student s:Students){
            if (s.getsId()==sId){
                return s;
            }
        }
        return new Student();
    }
}
