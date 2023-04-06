package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Collections.sort(sourceList, new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int rawX = Integer.parseInt(a);
        int rawY = Integer.parseInt(b);
        int x = orderFunction(rawX);
        int y = orderFunction(rawY);

        return x == y ? Integer.compare(rawX, rawY) : Integer.compare(x, y);
    }

    private int orderFunction(int i) {
        return 5 * i * i + 3;
    }
}
