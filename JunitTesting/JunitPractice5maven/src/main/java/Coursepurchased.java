interface Course{
    boolean purchasedcourse();
}
class javacourse implements Course {
    @Override
    public boolean purchasedcourse() {
        System.out.println("purchased java course");
        return true;
    }
}
class pythoncourse implements  Course{
    public boolean purchasedcourse(){
        System.out.println("purchased python course");
        return true;
    }
}
public class Coursepurchased {
    public static void main(String[] args) {
        Course course=new javacourse();
        course.purchasedcourse();
        Course course2=new pythoncourse();
        course2.purchasedcourse();
    }
}
