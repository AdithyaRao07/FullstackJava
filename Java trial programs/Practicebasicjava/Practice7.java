package Practicebasicjava;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) throws  ArithmeticException{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        try{
           if(b==0){
               throw new ArithmeticException("b should not be 0");
           }
           c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
