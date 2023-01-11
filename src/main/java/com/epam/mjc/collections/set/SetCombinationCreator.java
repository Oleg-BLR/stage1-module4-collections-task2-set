package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> combinationSet = new HashSet<>();
        Set<String> combinationCommonFirstSecond = new HashSet<>();
        Set<String> combinationFirstSecondMinusThird = new HashSet<>();
//        Set<String> combinationSet = new HashSet<>();

        for (String e1 : firstSet) {
            secondSet.stream().filter(e1::equals).map(e2 -> e1).forEach(combinationCommonFirstSecond::add);
        }
        return combinationCommonFirstSecond;
    }
}