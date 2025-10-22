package trialprograms;
class calc {
     public int  divide(int a,int b){
     return a/b;
     }
}

public class Junitpractice1 {
    public static void main(String[] args){
        calc num1=new calc();
       int result= num1.divide(10,2);
        if(result==5){
            System.out.println("Test case passed");
        }
        else {
            System.out.println("Test case not passed");
        }
        int result2=num1.divide(9,3);
        if (result2==3){
            System.out.println("Test case passed");
        }
        else {
            System.out.println("Test case not passed");
        }
        System.out.println(multiply(2,3));
    }
    public static int multiply(int a,int b){
        return a*b;
    }
}
