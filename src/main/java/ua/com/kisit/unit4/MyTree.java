package ua.com.kisit.unit4;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTree {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.naturalOrder());

        treeSet.add(1);
        treeSet.add(7);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(6);

        System.out.println(treeSet);

        TreeSet<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());

        treeSet2.add(3);
        treeSet2.add(7);
        treeSet2.add(5);
        treeSet2.add(8);
        treeSet2.add(10);
        treeSet2.add(9);

        System.out.println(treeSet2);

        // пошук спільної області
        TreeSet<Integer> treeSet3 = new TreeSet<>(treeSet);
        treeSet3.retainAll(treeSet2);
        System.out.println(treeSet3);

        // 
        TreeSet<Integer> treeSet4 = new TreeSet<>(treeSet);
        treeSet4.removeAll(treeSet2);
        System.out.println(treeSet4);
    }

}
