package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {
        ArrayList<String> newList = new ArrayList<>();

        if (sourceList == null) {
            return newList;
        }

        sourceList.forEach( item -> {
            if ((sourceList.indexOf(item) + 1) % 3 == 0) {
                newList.add(item);
                newList.add(item);
            }
        });

        return newList;
    }
}
