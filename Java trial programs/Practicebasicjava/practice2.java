package Practicebasicjava;
class Student {
    String name;
    private int marks;

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Enter marks between 0 and 100");
        }
    }

    public int getMarks() {
        return marks;
    }
    public void getGrade(){
        if(marks>=90 && marks<=100){
            System.out.println("A grade");
        } else if (marks>=50 && marks<=89) {
            System.out.println("B grade");
        }
        else {
            System.out.println("Fail");
        }
    }
}
public class practice2 {
    public static void main(String[] args) {
    Student Ajay=new Student();
    Ajay.name="Ajay Joseph";
    Ajay.setMarks(95);
        System.out.println(Ajay.name);
        System.out.println(Ajay.getMarks());
        Ajay.getGrade();
        Student chandu=new Student();
        chandu.setMarks(40);
        chandu.name="chandu candy";
        System.out.println(chandu.name);
        System.out.println(chandu.getMarks());
        chandu.getGrade();
    }
}
