package customers.a;

import customers.Customer;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AgeIterator<T> implements Iterator<Customer> {

    private final List<Customer> list;
    private int position;

    public AgeIterator(List<Customer> list) {
        this.list = list;
        this.position = 0;
        Collections.sort(list, Comparator.comparingInt(Customer::getAge));
    }

    @Override
    public boolean hasNext() {
        return position <= list.size() -1;
    }

    @Override
    public Customer next() {
        return list.get(position++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
