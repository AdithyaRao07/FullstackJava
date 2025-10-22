package com.example.RESTdemo;


import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Student {
    private String sName;
    private int sId;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sId=" + sId +
                '}';
    }
}
