//: generics/GenericArrayWithTypeTaken.java
package generics;

import java.lang.reflect.*;

public class GenericArrayWithTypeTaken<T> {
    private T[] array;
    @SuppressWarnings("unchecked")
    public GenericArrayWithTypeTaken(Class<T> type, int sz) {
        array = (T[])Array.newInstance(type, sz);
    }
    public void put(int index, T item) {
        array[index] = item;
    }
    public T get(int index) { return array[index]; }
    // Expose the underlying representation:
    public T[] rep() { return array; }
    public static void main(String[] args) {
        GenericArrayWithTypeTaken<Integer> gai =
            new GenericArrayWithTypeTaken<Integer>(
                Integer.class, 10);
        // This now works:
        Integer[] ia = gai.rep();
    }
}   ///:~
