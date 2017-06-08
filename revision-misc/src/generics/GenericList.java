package generics;

public class GenericList<T> implements GenericInterface<T> {
    public T myList;

    public void add(T t) {
        myList = t;
    }
}
