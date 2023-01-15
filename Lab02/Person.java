/**
 * Write a description of class Person here.
 * 
 * @author Milan Samplewala
 * @version Sept 14, 2018
 */
public class Person{
    private Name name;
    private Address address;
    int id;
    String phoneNumber;
    public Person(){
//         name = new Name("John", "Smith");
//         address = new Address();
//         id = 0;
//         phoneNumber = "";
        this(new Name("John", "Smith"), new Address(), 0, "");
    }
    public Person(String fName, String lName){
//        name = new Name(fName, lName);
//        address = new Address();
//         id = 0;
//         phoneNumber = "";
        this(new Name(fName, lName), new Address(), 0, "");
    }
    public Person(String fName, String lName, String addressLine1, String addressLine2){
//         name = new Name(fName, lName);
//         address = new Address(addressLine1, addressLine2);
//         id = 0;
//         phoneNumber = "";
        this(new Name(fName, lName), new Address(addressLine1, addressLine2), 0, "");
    }
    public Person(Name name, Address address, int id, String phoneNumber){
//         this.name = new Name(name);
//         this.address = new Address(address);
//         this.id = id;
//         this.phoneNumber = phoneNumber;
        this.setName(name);
        this.setAddress(address);
        this.setId(id);
        this.setPhoneNumber(phoneNumber);
    }
    public Person(Person person){
          this(person.getName(), person.getAddress(), 0, "");
    }
    public void setName(Name name){this.name = new Name(name);}
    public Name getName(){return (this.name);}
    public void setAddress(Address address){this.address = new Address(address);}
    public Address getAddress(){return (this.address);}
    public void setId(int id){this.id = id;}
    public int getId(){return (this.id);}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
    public String getPhoneNumber(){return (this.phoneNumber);}
    @Override
    public String toString() {
        return (name.toString() +  address.toString() + 
                "\nId: " + this.getId() + "\nPhone Number: " + this.getPhoneNumber() + "\n");
    }
}

