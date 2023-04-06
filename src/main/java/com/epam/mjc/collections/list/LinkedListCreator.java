package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> newList = new LinkedList<>();

        if (sourceList == null) {
            return newList;
        }

        sourceList.forEach((number) -> {
            if (number % 2 != 0) {
                newList.push(number);
            } else {
                newList.addLast(number);
            }
        });

        return newList;
    }
}
