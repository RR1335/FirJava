package generic.baijing.base;

import java.util.Arrays;

public class ArrayLT {
    Object[] obj = new Object[10];
    int size = 0;

    public <E> boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public <E> Object get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        Object[] o = new Object[size];
        for (int i = 0; i < size; i++) {
            o[i] = obj[i];
        }
        return Arrays.toString(o);
    }

}
