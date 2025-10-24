package Practicebasicjava;
//Creating Thread by extending Thread class
class MyThread extends Thread{
   int i=0;
    @Override
    public void run(){
        while(i<30){
            System.out.println("HI bro thread1 is running");
            i++;
            //Interrupted exception
            try{
                Thread.sleep(600);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class MyThread2 extends Thread{
    int i=0;
    @Override
    public void run(){
        while(i<25){
            System.out.println("hello thread2 is running");
            i++;
        }
    }
}
//2nd method of thread creation by implementing Runnable interface
class MyThread3 implements Runnable{
    int i=1;
    @Override
    public void run(){
        while(i<20){
            System.out.println("Thread3 is running");
            i++;
        }
    }
}
public class practice5 {
    public static void main(String[] args) {
     MyThread t1=new MyThread();
      //  MyThread2 t2=new MyThread2();
        t1.start();
        // t2.start();
        //MyThread3 t3=new MyThread3();
        //Thread obj1=new Thread(t3);
        //obj1.start();
        try{
            t1.join();
        }
catch (Exception e){
    System.out.println(e);
}
        System.out.println("hellllooo end of program");
    }
}
