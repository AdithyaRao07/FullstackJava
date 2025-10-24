package Practicebasicjava;
class Animal{
    String name;
    Animal(String name){
        this.name=name;
        System.out.println(name+" I am animal");
    }
}
class dog extends Animal{
    int age;
    dog(String name,int age){
        super(name);
        System.out.println(" Dog and my age is "+age);
    }
}
class shitzu extends dog{
    String color;
    shitzu(String name,int age,String color){
        super(name, age);
        System.out.println("Shitzu breed of color "+color);
    }
}
class   gd{
    gd(){
        System.out.println("I am grand father");
    }
 gd(int x){
     System.out.println("I am grandfather "+ x);
 }
}
class father extends gd{
    father(){
        System.out.println("i am father");
    }
    father(int x,int y){
        super(x);
        System.out.println("I am father "+ y);
    }
}
class son extends  father{
    son(int x,int y, int z){
        super(x,y);
        System.out.println("I am son "+z);
    }
}

public class practice3 {
    public static void main(String[] args) {
      shitzu leo=new shitzu("leo",4,"White");
      Animal cat=new Animal("Moon");
      dog tiger=new dog("tiger",5);
      son ravi=new son(100,50,20);
    }
}
