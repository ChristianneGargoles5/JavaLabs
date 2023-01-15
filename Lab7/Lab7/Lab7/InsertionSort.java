package Lab7;


/**
 * Write a description of class Insertion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsertionSort
{
    public static void insertionSort(int[]list){
        int temp;
        for (int i=0;i<list.length;i++){
            for (int j= i;j>0;j--){
               if(list[j]<list[j-1]){
                   temp=list[j];
                   list[j]=list[j-1];
                   list[j-1]=temp;
                }  
            }         
        }
      }  
}
