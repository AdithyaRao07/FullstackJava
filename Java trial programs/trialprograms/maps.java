package trialprograms;

import java.util.HashMap;

public class maps {
    public static void main(String[] args) {
        HashMap<String,Integer> details=new HashMap<>();
        details.put("Raj",1);
        details.put("Ravi",2);
        details.put("Ram",3);
        System.out.println(details.get("Raj"));
        System.out.println(details.containsKey("Ram"));
        System.out.println(details.isEmpty());
        System.out.println(details.remove("Raj"));
        System.out.println(details);
    }
}
