package com.epam.mjc.collections.set;

import java.util.*;

public class Main {
    public static void main(String[] args) {
////        List<Integer> odd = new ArrayList<>((Arrays.asList(5)));
////        List<Integer> even = new ArrayList<>((Arrays.asList(16)));
//        List<Integer> addAndEven = new ArrayList<>((Arrays.asList(7, 10, 6, -7, -2, 0, -2, -23)));
//        List<Integer> addAndEven2 = new ArrayList<>((Arrays.asList(2, -1, 5, -7, 4, 6, -9, 8)));
//        List<Integer> test2 = new ArrayList<>((Arrays.asList(-1, 5, 3, -3, 6, -7, -4, 2)));
////        HashSetCreator hashSetCreator = new HashSetCreator();
////        System.out.println(hashSetCreator.createHashSet(odd));
////        System.out.println(hashSetCreator.createHashSet(even));
//        SubsetOfSquaresCreator subsetOfSquaresCreator = new SubsetOfSquaresCreator();
////        List<Integer> list = Arrays.asList(1986, 1990, 1994,1998,2010, 2014, 2018);
////
//////        System.out.println(subsetOfSquaresCreator.createSubsetOfSquares(addAndEven, 0, 0));
//////        System.out.println(subsetOfSquaresCreator.createSubsetOfSquares(list, 1990,2014));
//        System.out.println(subsetOfSquaresCreator.createSubsetOfSquares(test2, 2,30));


        /*
        firstSet = ["Java", "Collection",  "framework", "interface", "class", "Queue"]
        secondSet = ["Queue", "iterator", "Java", "Collection","comparator"]
        thirdSet= ["Java", "Set", "Map", "List"]
         */

//        Set<String> firstSet = new LinkedHashSet<>();
        Set<String> firstSet = new LinkedHashSet<>();
        firstSet.add("Java");
        firstSet.add("Collection");
        firstSet.add("framework");
        firstSet.add("interface");
        firstSet.add("class");
        firstSet.add("Queue");
        firstSet.add("comparator");
        firstSet.add("Comparator");
//        firstSet.add("last");
        System.out.println(firstSet);

        Set<String> secondSet = new LinkedHashSet<>();
        secondSet.add("Queue");
        secondSet.add("iterator");
        secondSet.add("Java");
        secondSet.add("Collection");
        secondSet.add("comparator");
        secondSet.add("Comparator");
//        secondSet.add("last");
        System.out.println(secondSet);

        Set<String> thirdSet = new LinkedHashSet<>();
        thirdSet.add("Set");
        thirdSet.add("Java");
        thirdSet.add("Map");
        thirdSet.add("List");
        System.out.println(thirdSet);

        SetCombinationCreator setCombinationCreator = new SetCombinationCreator();
        System.out.println(setCombinationCreator.createSetCombination(firstSet, secondSet, thirdSet));

    }
}
