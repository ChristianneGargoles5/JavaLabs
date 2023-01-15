package Lab7;


/**
 * Write a description of class QuickSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
class QuickSortNonRecursive
{
public static void quickSort(int[] list){
    quickSort(list, 0 , list.length-1);
}
public static void quickSort(int[] list, int first, int last){
    
    Stack<Integer> stack= new Stack<Integer>();
    stack.push(first);
    stack.push(last);
    while (!stack.empty())
    {
    last = (Integer)stack.pop();
    first= (Integer)stack.pop();
    if (last<=first)
    continue;
    int pivotIndex=partition(list, first,last);
    if ((pivotIndex-first)>(last-pivotIndex)){
        stack.push(first);
        stack.push(pivotIndex-1);
    }
    stack.push(pivotIndex+1);
    stack.push(last);
    if ((last-pivotIndex)>= (pivotIndex-first)){
        stack.push(first);
        stack.push(pivotIndex-1);
     
      }
}
}
private static int partition (int[] list, int first, int last){
    int pivot=list[first];
    int low= first+1;
    int high= last;
    
    while (high>low){
        while (low<=high&&list[low]<=pivot)
        low++;
        while (low<=high&& list[high]>pivot)
        high--;
        
        if (high>low)
        {
        int temp=list[high];
        list[high]=list[low];
        list[low]=temp;
    }
}
    while (high>first&&list[high]>=pivot)
    high--;
    if (pivot>list[high])
    {
        list[first]=list[high];
        list[high]=pivot;
        return high;
    }
    else
    {
        return first;
    }
    }
}
    


    
    
    


