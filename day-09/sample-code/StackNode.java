public class StackNode<T> {

   private T myValue;

   private StackNode<T> next;

   public StackNode(T newValue) {
       this.myValue = newValue;
       this.next = null;
   }

   public T getValue() {
       return myValue;
   }

   public void setNext(StackNode<T> node) {
       this.next = node;
   }

   public StackNode<T> getNext() {
       return next;
   }

   // You can use this to check if we are at the bottom,
   // or the method above to check if there is an element
   public boolean isAtTheBottom() {
    return (next == null);
   }

}