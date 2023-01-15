
/**
 * Write a description of class FinalExam here.
 *
 * @author Christianne Gargoles
 * @version 12/13/18
 */
import java.util.Scanner;

public class FinalExam {
  public static String dec2Bin(int value){
    if(value == 0){
      return "";
    }
    else{
      return dec2Bin(value/2) + "" + (value%2);
    }
  }
  public static void main(String args[]){
    int num;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter decimal value: ");
    num = sc.nextInt();
    System.out.println(dec2Bin(num));
  }
}
/*
Enter decimal value: 15
1111

Enter decimal value: 96
1100000

 */