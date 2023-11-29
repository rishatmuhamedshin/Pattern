package ru.muhamedshin.RealBook.ADAPTER.test;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumeration implements Enumeration<Object> {
    Iterator<?> iterator;

    public IteratorToEnumeration(Iterator<?> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }

    @Override
    public Iterator<Object> asIterator() {
        return Enumeration.super.asIterator();
    }
}
