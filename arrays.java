import java.util.ArrayList;


public class MyClass {
    public static void main(String args[]) {
        // create array: immutable
        int[] hisFamilyMembersAges = {44, 45, 20};
        int[] myFamilyMembersAges = {40, 40, 21, 29, 15};
        
        // indexing
        System.out.println(hisFamilyMembersAges[1]);
        hisFamilyMembersAges[1] = 35;
        System.out.println(hisFamilyMembersAges[1]);
        
        // length is a filed, not function
        System.out.println(myFamilyMembersAges.length);
        
        // create ArrayList
        ArrayList familyMembersAges = new ArrayList();
        
        // add: mutable
        familyMembersAges.add(44);
        familyMembersAges.add(43);
        familyMembersAges.add(12);
        
        // size is a function
        System.out.println();
        System.out.println(familyMembersAges.size());
        
        // add a value in the middle of the list
        // add(where, what)
        System.out.println(familyMembersAges);
        familyMembersAges.add(1, 25);
        System.out.println(familyMembersAges);
        
        // delete
        familyMembersAges.remove(0);
        System.out.println(familyMembersAges);
        
        // it was said to cast values to a string type
        // if we want to print it... well... oke
        System.out.println();
        System.out.println(familyMembersAges.toString());
        
    }
}
