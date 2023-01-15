/**
 * Write a description of class Student here.
 * 
 * @author Milan Samplewala
 * @version Sept 14, 2018
 */
class Student extends Person {
    private Status status;    
    public Student(){
        this(Status.ENROLLED);
    }
    public Student(Status status){
        this.setStatus(status);
    }
    public Student(Person person, Status status){
        this(person.getName(), person.getAddress(), status);
    }
    public Student(Name name, Address address, Status status){
        super(name, address, 0, "");
        this.setStatus(status);
    }
    public void setStatus(Status status){this.status = status;}    
    public Status getStatus(){return status;}
    @Override
    public String toString(){
        return (super.toString() +
               "Status: " + this.getStatus() + "\n");
    }
}
