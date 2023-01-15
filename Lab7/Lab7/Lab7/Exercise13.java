package Lab7;


/**
 * Write a description of class Lab 7 here.
 *
 * @author Christianne Gargoles
 * @version 11/5/18
 */


public class Exercise13 {
    public static void main (String[] args){
 // create a two-dimensional array for selection sort
int[][] selectionArray=new int [6][];
selectionArray[0]=new int [5000];
selectionArray[1]=new int [10000];
selectionArray[2]=new int [15000];
selectionArray[3]=new int [20000];
selectionArray[4]=new int [25000];
selectionArray[5]=new int [30000]; 
//create a two dimensional array for insertion sort
int[][] insertionArray=new int [6][];
insertionArray[0]=new int [5000];
insertionArray[1]=new int [10000];
insertionArray[2]=new int [15000];
insertionArray[3]=new int [20000];
insertionArray[4]=new int [25000];
insertionArray[5]=new int [30000]; 


// create a two-dimensional array for bubble sort
int[][] bubbleArray=new int [6][];
bubbleArray[0]=new int [5000];
bubbleArray[1]=new int [10000];
bubbleArray[2]=new int [15000];
bubbleArray[3]=new int [20000];
bubbleArray[4]=new int [25000];
bubbleArray[5]=new int [30000]; 



// create a two-dimensional array for merge sort
int[][]mergeArray=new int [6][];
mergeArray[0]=new int [5000];
mergeArray[1]=new int [10000];
mergeArray[2]=new int [15000];
mergeArray[3]=new int [20000];
mergeArray[4]=new int [25000];
mergeArray[5]=new int [30000]; 

// create a two-dimensional array for quick sort
int[][]quickArray=new int [6][];
quickArray[0]=new int [5000];
quickArray[1]=new int [10000];
quickArray[2]=new int [15000];
quickArray[3]=new int [20000];
quickArray[4]=new int [25000];
quickArray[5]=new int [30000]; 


// create a two-dimensional array for heap sort
int[][]heapArray=new int [6][];
heapArray[0]=new int [5000];
heapArray[1]=new int [10000];
heapArray[2]=new int [15000];
heapArray[3]=new int [20000];
heapArray[4]=new int [25000];
heapArray[5]=new int [30000]; 

long startTime=0, endTime=0;

long [] selectionExecutionTime=new long[6];
long [] insertionExecutionTime=new long[6];
long [] bubbleExecutionTime=new long[6];
long [] mergeExecutionTime=new long[6];
long [] quickExecutionTime=new long[6];
long [] heapExecutionTime=new long[6];

for (int i=0;i<selectionArray.length;i++){
    for (int j=0; i<selectionArray[i].length;j++){
        int number=(int) (Math.random()*1000);
        selectionArray[i][j]=number;
        insertionArray[i][j]=number;
        bubbleArray[i][j]=number;
        mergeArray[i][j]=number;
        quickArray[i][j]=number;
        heapArray[i][j]=number;
    }
}
for (int i=0;i<selectionArray.length;i++){
    startTime=System.nanoTime();
    SelectionSort.selectionSort(selectionArray[i]);
    endTime=System.nanoTime();
    selectionExecutionTime[i]=endTime-startTime;
    startTime=0;
    endTime=0;
}
for (int i=0;i<insertionArray.length;i++){
    startTime=System.nanoTime();
    InsertionSort.insertionSort(insertionArray[i]);
    endTime=System.nanoTime();
    insertionExecutionTime[i]=endTime-startTime;
    startTime=0;
    endTime=0;
}
for (int i=0;i<mergeArray.length;i++){
    startTime=System.nanoTime();
    MergeSort.mergeSort(mergeArray[i]);
    endTime=System.nanoTime();
    mergeExecutionTime[i]=endTime-startTime;
    startTime=0;
    endTime=0;
}
for (int i=0;i<quickArray.length;i++){
    startTime=System.nanoTime();
    QuickSortNonRecursive.quickSort(quickArray[i]);
    endTime=System.nanoTime();
    quickExecutionTime[i]=endTime-startTime;
    startTime=0;
    endTime=0;
}
for (int i=0;i<heapArray.length;i++){
    startTime=System.nanoTime();
    HeapSort.heapSort(heapArray[i]);
    endTime=System.nanoTime();
    heapExecutionTime[i]=endTime-startTime ;
    
    startTime=0;
    endTime=0;
    
}
System.out.printf("%10s%2s%15s%13s%13s%13s%13s%13s\n","Array size","|","Selection Sort","Insertion Sort","Bubble Sort","Merge Sort","Quick Sort","Heap Sort");
System.out.println("---------|--------------------------------------------------------------------------------------------------------------------------------");
for (int i=0;i<selectionArray.length;i++){
    System.out.printf("%7s%5s%13s%14s%13s%13s%13s%13s%13s\n", selectionArray[i].length, "|",selectionExecutionTime[i],insertionExecutionTime[i],bubbleExecutionTime[i],mergeExecutionTime[i],quickExecutionTime[i],heapExecutionTime[i]);
}
}
}