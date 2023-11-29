package ru.muhamedshin.RealBook.ADAPTER.test;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList("asadasd","asdasdasd");
        IteratorToEnumeration enumeration = new IteratorToEnumeration(arrayList.listIterator());

        System.out.println(enumeration.hasMoreElements());
        System.out.println(enumeration.nextElement());
    }
}
