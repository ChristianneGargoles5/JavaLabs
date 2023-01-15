
/**
 * Write a description of class fdfgsvx here.
 *
 * @author Christianne Gargoles
 * @version 11/08/2018
 */
import java.util.*;
public class Question1
{
     public static void main(String[] args){
        System.out.println();
        useFirst();
    }
    public static void useFirst(){
      Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("Pineapple");
        myQueue.offer("Pear");
        myQueue.offer("Quamquat");
        myQueue.poll();
        myQueue.poll();
        myQueue.offer("Grape");
        myQueue.offer("Dragon Fruit");
        myQueue.offer("Boysenberries");
        myQueue.offer("Lime");  
        while (myQueue.size()>0){
            myQueue.poll();
        }
        myQueue.offer("Pineapple");
        myQueue.offer("Cantaloupe");
        myQueue.offer ("Dragon Fruit");
        myQueue.offer ("Blueberries");
        myQueue.offer ("Pomegrante");
        myQueue.offer ("Mango");
        
        System.out.print(myQueue);    
    }

}
