package com.salah.introtodesignpatterns.iterator;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
