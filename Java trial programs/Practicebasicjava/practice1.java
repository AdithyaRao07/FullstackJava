package Practicebasicjava;
class vehicle{
    public void start(){
        System.out.println("vehicle started");
    }
}
//Inherits the vehicle class
class bike extends vehicle{
    String company;
    static  int MaxSpeed=80;
    int price;
    bike(){
        System.out.println( "zui zui");
    }
    bike(String company,int price){
        this.company=company;
        this.price=price;
    }
    @Override
    public void start(){
        System.out.println(company +" Started "+MaxSpeed+ "Maxspeed" );
    }
}
public class practice1 {
    public static void main(String[] args) {
        bike RE=new bike("bullet",350000);
        RE.start();
        bike splendor=new bike();
        splendor.company="splendor plus";
        splendor.start();
        System.out.println(splendor.MaxSpeed);
        vehicle truck=new vehicle();
        truck.start();
    }
}
