
//A sealed class is a class which is used to restrict the inheritance to specific classes and the subclass should be specified with the sealed class with permits keyword
//The subclasses should also be specified as final,sealed or non-sealed
sealed class computer permits laptop,desktop{
    void print(){
        System.out.println("HIII");
    };
}
non-sealed class laptop extends computer{
    @Override
    void print() {
        super.print();
    }
}
final class desktop extends computer{
   @Override
    public void print(){
        System.out.println("hello");
    }
}
public class practice1 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        var c=3;
        // will show error coz no value is assigned var d;
    }
}
