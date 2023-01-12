package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
//        Set<String> combinationSet = new HashSet<>();
        Set<String> firstCondition = new LinkedHashSet<>();
        Set<String> combinationFirstSecondMinusThird = new HashSet<>();
//        Set<String> combinationSet = new HashSet<>();

        Set<String> tempStringSet = new LinkedHashSet<>();
        for (String e1 : firstSet) {
            secondSet.stream().filter(e1::equals).map(e2 -> e1).forEach(firstCondition::add);
        }
        tempStringSet.addAll(firstCondition);
        System.out.println("nnnnnnnnnn");
        System.out.println(firstCondition);
        System.out.println("nnnnnnnnnn");
//        firstCondition.clear();


//        Set<String> names = Sets.newHashSet("Tom", "Jane", "Karen");
        Iterator<String> iterator = tempStringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("iterator.next = " + iterator.next());
            System.out.println(thirdSet.contains(iterator.next()));
            if (thirdSet.contains(iterator.next())) {
                firstCondition.remove(iterator.next());
//                combinationFirstSecondMinusThird.add(iterator.next());
            }
        }


//        for (String e1 : thirdSet) {
//            for (String e2 : tempStringSet) {
//                if (e1.equals(e2)) {
//                    firstCondition.remove(e1);
//                }
//            }
//            thirdSet.stream().filter(e1::equals).map(e2 -> e1).forEach(combinationCommonFirstSecond::remove);
//        }
//        System.out.println(tempStringSet);
//        return firstCondition;
        return tempStringSet;
    }
}