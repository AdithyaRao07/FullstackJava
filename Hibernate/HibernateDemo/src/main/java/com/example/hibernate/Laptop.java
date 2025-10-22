package com.example.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
    private int Lid;
    private String Lname;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @ManyToOne
    @JoinColumn(name = "student_Sid")
    private Student student;
    public int getLid() {
        return Lid;
    }

    public void setLid(int lid) {
        Lid = lid;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "Lid=" + Lid +
                ", Lname='" + Lname + '\'' +
                '}';
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }
}
