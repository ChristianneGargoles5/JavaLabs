/**
 * Write a description of class Exercise24_05 here.
 *
 * @author Christianne Gargoles
 * @version 11/28/2018
 */
public class Exercise24_05 {
 public static void main(String[] args) {
  GenericQueue<String> queue = new GenericQueue<String>();
  queue.enqueue("Tom");
  System.out.println("(7) " + queue);
  queue.enqueue("Susan");
  System.out.println("(8) " + queue);
  queue.enqueue("Kim");
  queue.enqueue("Michael");
  System.out.println("(9) " + queue);
  System.out.println("(10) " + queue.dequeue());
  System.out.println("(11) " + queue.dequeue());
  System.out.println("(12) " + queue);
 }
 static class GenericQueue<E> extends java.util.LinkedList<E> {
  private static final long serialVersionUID = 1L;
  public void enqueue(E e) {
   addLast(e);
  }
  public E dequeue() {
   return removeFirst();
  }
  public int getSize() {
   return size();
  }
  @Override
  public String toString() {
   return "Queue: " + super.toString();
  }
 }
}

