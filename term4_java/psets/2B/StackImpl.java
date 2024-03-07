import java.util.*;

public class StackImpl<T> implements CustomStack<T> {

  private LinkedList<T> myList;

  StackImpl() {
    myList = new LinkedList<>();
  }

  @Override
  public void push(T t) {
    myList.addLast(t);
  }

  @Override
  public T pop() {
    if (this.size() == 0) {
      return null;
    } else {
      T temp = myList.getLast();
      myList.removeLast();
      return temp;
    }
  }

  @Override
  public int size() {
    return myList.size();
  }

  @Override
  public T peek() {
    if (this.size() == 0) {
      return null;
    } else {
      return myList.getLast();
    }
  }

  @Override
  public boolean isEmpty() {
    return this.size() == 0;
  }
}
