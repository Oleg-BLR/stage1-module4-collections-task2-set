package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        sourceList.forEach(e -> {
            if (e == 0) {
                hashSet.add(e);
            }else if (e % 2 == 0) {
                double eM = e;
                while (eM % 2 == 0) {
                    hashSet.add((int) eM);
                    eM = eM/2;
                }
                hashSet.add((int) eM);
            } else {
                hashSet.add(e);
                hashSet.add(e * 2);
            }
        });
        return hashSet;
    }
}
