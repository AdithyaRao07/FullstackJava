class Calc{
    public int divide(int a,int b){
        return a/b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
}
public class JunitTesting {
    public static void main(String[] args) {
        Calc num1=new Calc();
        System.out.println(num1.divide(20,4));
        System.out.println(num1.multiply(10,5));
    }
}
