package StructuralPatterns.Adapter.Enumerations;

import java.util.Enumeration;
import java.util.Iterator;

class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
//    В Enumeration есть метод asIterator, возвращающий адаптированный объект Behavioral.Iterator
}
