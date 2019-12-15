import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        HashMap myFamily = new HashMap();
        myFamily.put("Ekaterina", 23);
        myFamily.put("Irina", 45);
        myFamily.put("Michael", 49);
        
        System.out.println(myFamily.get("Irina"));
        System.out.println(myFamily.size());
        System.out.println(myFamily);
        
        myFamily.remove("Michael");
        System.out.println();
        System.out.println(myFamily);
        
        myFamily.put("Ekaterina", 2);
        System.out.println();
        System.out.println(myFamily);
    }
}
