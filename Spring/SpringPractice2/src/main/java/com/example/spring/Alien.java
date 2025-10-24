package com.example.spring;

public class Alien {
    int age;
    Laptop laptop;

 //    public Alien(){
    //    System.out.println("Object Created");
  //  }
    public Alien(int age){
        this.age=age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Age Assigned");
        this.age = age;
    }

    public void code(){
        System.out.println("I am coding");
        laptop.compile();
    }
}
