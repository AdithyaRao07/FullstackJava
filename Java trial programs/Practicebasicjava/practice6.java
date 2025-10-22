package Practicebasicjava;

import java.util.Scanner;

public class practice6 {
    public static void main(String[] args) {
        int [] arr={1,15,10,5};
        int a=5;
        int b=10;
        int c;
        int d;
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter array index to get element");
            int id=sc.nextInt();
            System.out.println(arr[id]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            c = a+b;
            System.out.println(c);
            try {
                d=c-b;
                System.out.println(d);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
