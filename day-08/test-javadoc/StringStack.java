/**
* An StringStack is a dynamic structure that can contain any number
* of strings.
*
* New elements (i.e. Strings) can be put on top of the stack or
* removed from the top of the stack. Only the element at the top of
* the stack can be removed at any given time; to access a specific
* element, all elements on top of it must be removed (popped) first.
*
* This interface allows the user to replace some elements of the list
* even if they are not accessible.
*/
public interface StringStack {
/**
* Put an element at the top of the stack.
*
* @param newString the new string to be put
*/
void push(String newString);
/**
* Removes the element at the top of the stack and returns it.
*
* @return the element at the top of the stack
*/
String pop();
/**
* Replaces every occurrence of one string in the stack
* for another string.
*
* @param oldString the string to be replaced
* @param newString the new string to replace it with
*/
void push(String oldString, String newString);
}