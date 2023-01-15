import java.util.*;
import java.io.*;
/**
 * Write a description of class CopyFile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyFile{
public static void main(String[]args){
    File file=new File(args[0]);
    try{
    Scanner in =new Scanner(file);
    PrintWriter out = new PrintWriter("Copy.txt");
    while (in.hasNext()){
        out.println(in.nextLine());
    }

    System.out.println("Copy made");
    out.close();
    }
    catch(FileNotFoundException Scanner){
    System.out.println("The file can not be found");
        }
    }
}
