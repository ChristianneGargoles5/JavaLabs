
/**
 * Write a description of class TestHeap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestHeap
{
    public static void main(String[] args){
        Integer[] nodes=new Integer[]{8,9,2,3,4,1,5,6,7};
        MinHeap<Integer>heap=new MinHeap<Integer>(nodes);
        System.out.println("Min-Heap Sort");
        for (int i=0;i<heap.getSize();i++)
        System.out.print(heap.nodeAt(i)+" " );
    
}
}
