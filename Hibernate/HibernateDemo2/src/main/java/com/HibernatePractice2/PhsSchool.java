package com.HibernatePractice2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PhsSchool {
    public static void main(String[] args) {
//        Student Stu1=new Student();
//        Stu1.setSid(4);
//        Stu1.setSname("Geet");
//        Stu1.setTech("JavaScript");
        Configuration config=new Configuration().addAnnotatedClass(com.HibernatePractice2.Student.class);
        config.configure();
        SessionFactory sf= config.buildSessionFactory();
        Session s1=sf.openSession();
        //Eager Fetching
       Student Stu1=s1.find(Student.class,4);
        // lazy fetching
       //  Student Stu1=s1.byId(Student.class).getReference(1);

       Transaction tx= s1.beginTransaction();
      s1.remove(Stu1);
//     System.out.println(Stu1);
       tx.commit();
       s1.close();
       sf.close();
    }
}
