package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        NavigableSet<Integer> setOfSquares = new TreeSet<>();
        sourceList.forEach(integer -> setOfSquares.add(integer * integer));
        NavigableSet<Integer> subSetOfSquares = setOfSquares.subSet(lowerBound, true, upperBound, true);
        return subSetOfSquares;
    }
}
