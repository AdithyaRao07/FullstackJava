package com.example.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.Transient;
import java.sql.Array;
import java.util.Collection;


public class App {
    public static void main(String[] args) {
       /* Alien telusko=new Alien();
        AlienName an=new AlienName();
        an.setFname("Adithya");
        an.setMname("Venkateshwar Rao");
        an.setLname("Madupu");*/
        Alien a=new Alien();
        Alien a2=new Alien();
        Alien a3=new Alien();
//        //setting the data
//        telusko.setId(101);
//        telusko.setName(an);*/
//        Student student=new Student();
//        student.setSid(2);
//        student.setSname("Chandana");
//        Laptop laptop=new Laptop();
//        laptop.setLid(102);
//        laptop.setLname("Dell");
//        laptop.setStudent(student);
//        student.getLaptop().add(laptop);
        // @Transient this annotation is used to discard the column from the table or not consider the column
       // telusko.setColor("Green");
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder()
                .applySettings(con.getProperties())
                .build();
        SessionFactory sf=con.buildSessionFactory(reg);
        Session s1=sf.openSession();
       Transaction tx= s1.beginTransaction();
       a=(Alien)s1.get(Alien.class,101);
        a2=(Alien)s1.get(Alien.class,101);

        System.out.println(a);
        System.out.println(a);
        s1.getTransaction().commit();
        //Saving the data
         //s1.save(telusko);
//       s1.save(student);
//       s1.save(laptop);
        //Fetching the data
       // telusko=(Alien) s1.get(Alien.class,101);//typecasting the data
//        Student student=s1.get(Student.class,1);
//      System.out.println(student.getLaptop());
//        Student student = s1.get(Student.class, 2);
//        if (student != null) {
//            System.out.println("Student: " + student.getSname());
//            System.out.println("Laptops: " + student.getLaptop());
//        } else {
//            System.out.println("Student not found");
//        }
//
//

//        //System.out.println(telusko);
       s1.close();
       Session s2= sf.openSession();
       Transaction tx2= s2.beginTransaction();
       a3=(Alien)s2.get(Alien.class,102);
        System.out.println(a3);
        s2.getTransaction().commit();
        s2.close();
    }
}
