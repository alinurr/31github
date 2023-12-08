package Collections;

import java.util.HashSet;

public class MainHashSet {
    public static void main(String[] args){

        HashSet<Integer> numSetOne = new HashSet<>();

        numSetOne.add(2);
        numSetOne.add(3);
        numSetOne.add(4);

        HashSet<Integer> numSetTwo = new HashSet<>();
        numSetTwo.add(3);
        numSetTwo.add(4);
        numSetTwo.add(5);
        numSetTwo.add(2);

        //Union of HashSet
        numSetOne.addAll(numSetTwo);
        System.out.println(numSetOne);

        //Intersection of HashSet
        numSetOne.retainAll(numSetTwo);
        System.out.println(numSetOne);

        //Difference of HashSet
        numSetOne.removeAll(numSetTwo);
        System.out.println(numSetOne);

        //Subset
        boolean result = numSetTwo.containsAll(numSetTwo);
        System.out.println(result);

    }
}
