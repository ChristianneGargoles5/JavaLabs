package Lab7;


/**
 * Write a description of class dcfvb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionSort{
public static void selectionSort(int[] list){
for (int i=0;i<list.length-1;i++){
    int currentMin=list[i];
    int currentMinIndex=i;
    for (int j=i+1;j<list.length;j++){
        if(currentMin>list[j]){
            currentMin=list[j];
            currentMinIndex=j;
        }
    }
    if (currentMinIndex!=i){
        list[currentMinIndex]=list[i];
        list[i]=currentMin;
    }
}
}
}
