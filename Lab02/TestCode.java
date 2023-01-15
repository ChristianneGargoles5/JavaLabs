/**
 * Write a description of class TestCode here.
 * 
 * @author Milan Samplewala
 * @version Sept 14, 2018
 */
import java.util.Date;
public class TestCode{
    public static void main(String[] args){
    // Test the Name class and its constructors (3)
         Name maria = new Name();           // 1
         System.out.println("maria\n" + maria.toString()); // toString()
         Name john;   // only reference variable. no object created
         john = new Name("John", "Smith");  // 2
         System.out.println("john\n" + john.toString());
         Name alias = john;
         alias.setFName("Jill");
         System.out.println("alias\n" + alias.toString());
         System.out.println("john\n" + john.toString());
         Name twin = new Name(maria);      // 3
         twin.setFName("America");     // setFName()
         twin.setLName("Gonzales");    // setLName()
         maria.setFName("Maria");
         maria.setLName("Young");
         System.out.println("twin\n" + twin.toString());
         System.out.println("maria\n" + maria.toString());
    
    // Test the address class and its constructors (3) 
    // you write this code - take the example above.
    
    // .....complete the code above
   
    // Test the Person class and its constructors (5)
         Person person1 = new Person();
         System.out.println("person1\n" + person1.toString() + "\n");
         Person person2 = new Person("Debby", "Wong");
         System.out.println("person2\n" + person2.toString() + "\n");
         Person person3 = new Person("Carole", "Akl", "123 Happy Lane", "Sylmar, CA 91342");
         System.out.println("person3\n" + person3.toString() + "\n");
         person1.setName(new Name("Monte", "Perez"));
         Address lamc = new Address("1356 Eldridge Avenue", "Sylmar, CA 91342");
         Person person4 = new Person(person1.getName(), lamc, 1111, "818-364-7600");
         System.out.println("person4\n" + person4.toString() + "\n");
         Person person5 = new Person();
         person5.setName(new Name("New", "Student"));
         person5.setAddress(new Address("777 Success Blvd", "Dollarville, CA 97777"));
         person5.setId(7777);
         person5.setPhoneNumber("777-888-8811");
         System.out.println("person5\n" + person5.toString() + "\n");
         Person person6 = new Person(person5);
         System.out.println("person6\n" + person6.toString() + "\n");
         person3.setPhoneNumber("838-929-0101");
         Person test = new Person(maria, new Address("543 Florence Blvd", "Goodland, FL 12345"),
                     person4.getId()+10, person3.getPhoneNumber());
         System.out.println("test\n" + test.toString() + "\n");
         
// Test the Student class and its constructors (4)
         Student you = new Student();
         Student friend = new Student(Status.REGISTERED);
         Name tmp = new Name("Milan", "Samplewala");
         you.setName(tmp);
         you.setAddress(new Address("269 Brand Blvd", "Santa Barbara, CA 45459"));
         you.setStatus(Status.ARCHIVED);
         you.setId(2222);
         System.out.println("you\n" + you.toString());
         System.out.println("friend\n" + friend.toString());
         
// Test the Staff class and its Constructors (4)
System.out.println("\n\nTesting the Staff class\n" +
                   "     Parent is the Person class\n" + 
                   "          Person is composed of Name and Address classes.\n");
         Staff secretary = new Staff();
         System.out.println("secretary\n" + secretary.toString());
         Staff withDate = new Staff(new Date(), 4000);
         System.out.println("withDate\n" + withDate.toString());
         Staff withPerson = new Staff(person4, new Date(), 11000);
         System.out.println("withPerson\n" + withPerson.toString());
         Staff newEmp = new Staff(twin, lamc, new Date(), 3998);
         System.out.println("newEmp\n" + newEmp.toString());
         
         
    }
}
