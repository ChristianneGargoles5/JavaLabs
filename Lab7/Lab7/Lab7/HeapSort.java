package Lab7;




/**
 * Write a description of class HeapSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HeapSort{
public static <E extends Comparable> void heapSort(E[] list)
{
   Heap <E> heap= new Heap<E>();
   for (int i=0;i<list.length;i++)
   heap.add(list[i]);
   for (int i=list.length-1;i>=0;i--)
   list[i]=heap.remove();
}
}
