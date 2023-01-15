
/**
 * Write a description of class TestGenericStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestGenericStack
{
    public static void main (String[] args){
      GenericStack<Integer> ages = new GenericStack();
      GenericStack<String> names= new GenericStack();
      names.push ("Laiza");
      ages.push(21);
      names.push("Elsie");
       ages.push(68);
       names.push ("Eric");
       ages.push(21);
       System.out.println(ages.toString());
       System.out.println(ages.getSize());
       while (!ages.isEmpty()){
       System.out.print(ages.pop()+ " ");
    }
    System.out.println();
    }
}
