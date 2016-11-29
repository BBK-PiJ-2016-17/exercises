/**
 * Ex 3 - Day 09 / Generic list
 * Modify the doubly-linked list that you have created in past weeks to make it
 * generic, i.e. to allow it to have values of its elements of any type.
 * Once you have it ready, create a class Company that keeps two linked lists,
 * one with the names of the employees and one with their National Insurance
 * Number.
 *
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