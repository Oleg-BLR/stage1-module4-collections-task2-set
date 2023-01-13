package com.epam.mjc.collections.set;

import java.util.*;

public class SetCombinationCreator {

    public Set<String> createSetCombination (Set<String> firstSet,
                                              Set<String> secondSet,
                                              Set<String> thirdSet) {
        Set<String> combinationSet = new LinkedHashSet<>();

        firstSet.forEach(e -> {
            if (secondSet.contains(e) && !thirdSet.contains(e)) {
                combinationSet.add(e);
            }
        });

        thirdSet.forEach(e -> {
            if (!firstSet.contains(e) && !secondSet.contains(e)) {
                combinationSet.add(e);
            }
        });

        return combinationSet;
    }
}
