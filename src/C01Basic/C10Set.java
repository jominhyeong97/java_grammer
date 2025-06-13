package C01Basic;

import java.util.HashSet;
import java.util.Set;

public class C10Set {
    public static void main(String[] args) {
//        중복이 없고 순서가 보장안됨.

        Set<String> mySet = new HashSet<>();
        mySet.add("5");
        mySet.add("5");
        mySet.add("5");
        mySet.add("5");
        mySet.add("5");
        mySet.add("3");
        mySet.add("1");
        mySet.add("3");
        mySet.add("5");
        System.out.println(mySet);


    }
}
