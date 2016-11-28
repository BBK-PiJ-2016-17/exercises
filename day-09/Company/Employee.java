/**
 * Generic version of the Employee class.
 * @param <T> the type of the value being used
 */

public class Employee<T> {

    private T t;
    private Employee<T> prevT;
    private Employee<T> nextT;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public Employee<T> getPrevT() {
        return this.prevT;
    }

    public void setPrevT(Employee<T> prev) {
        prevT = prev;
    }

    public Employee<T> getNextT() {
        return this.nextT;
    }

    public void setNextT(Employee<T> next) {
        nextT = next;
    }
}