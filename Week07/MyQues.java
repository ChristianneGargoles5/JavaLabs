
/**
 * Write a description of class MyQueue here.
 * 
 * @author Christianne Gargoles
 * @version 10/18/2018
 */
import java.util.*;
/*
 * From useQueue, print out
 * [Strawberries, Whipped Cream, Blueberries, Whipped Cream, Strawberries, Whipped Crean, Powdered Choclolate]
 * 
 * From useDeque, print out
 * [Pineapple Cake, Whipped Cream, Strawberries, Whipped Cream, Powdered Choclolate]
 *
 * From usePque, print out
 * [Bananas, Vanilla Wafers, Whipped Cream]
 * 
 * Do not remove or modify the code below.
 * You can add code where indicated.
 */
public class MyQues{
    public static void main(String[] args){
        System.out.println();
        useQueue();
        System.out.println();
        useDeque();
        System.out.println();
        usePque();
        System.out.println();
    }

    public static void useQueue(){
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("Blueberries");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.poll();
        myQueue.poll();
        myQueue.offer("Whipped Cream");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.offer("Powdered Choclolate");
        //Add code below
        while (myQueue.size()>0){
            myQueue.poll();
        }
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.offer ("Blueberries");
        myQueue.offer ("Whipped Cream");
        myQueue.offer ("Strawberries");
        myQueue.offer ("Whipped Cream");
        myQueue.offer ("Powdered Choclolate");
        // algorithm used - empty the queue and re-populate in order reqd.
        // create another queue, myQueue reference the new queue
        // create an array of String to list
        // use constructor to add 
        //Add code below
        System.out.print(myQueue);
    }

    public static void useDeque(){
        Deque<String> myQueue = new LinkedList<>();
        myQueue.offer("Blueberries");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.poll();
        myQueue.poll();
        myQueue.offer("Whipped Cream");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.offer("Powdered Choclolate");
        // Add code below
        //Pineapple Cake, Whipped Cream, Strawberries, Whipped Cream, Powdered Choclolate
        // Not sure how
        // Add code above
        System.out.print(myQueue);
    }

    public static void usePque(){
        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.offer("Blueberries");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.poll();
        myQueue.poll();
        myQueue.offer("Whipped Cream");
        myQueue.offer("Strawberries");
        myQueue.offer("Whipped Cream");
        myQueue.offer("Powdered Choclolate");
        // Add code below
        while(myQueue.size()>0){
        System.out.print(myQueue.remove() + " ");
        }
        //[Bananas, Vanilla Wafers, Whipped Cream]
        PriorityQueue<String>myQueue2=new PriorityQueue<>();
        myQueue2.offer("Bananas");
        myQueue2.offer("Vanilla");
        myQueue2.offer("Whipped Cream");
        // Add code above
        System.out.print(myQueue);
        System.out.print(myQueue2);
    }

}