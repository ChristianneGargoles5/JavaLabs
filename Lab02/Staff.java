 
/**
 * Write a description of class Staff here.
 * 
 * @author Milan Samplewala
 * @version Sept 14, 2018
 */
import java.util.Date;
class Staff extends Person {
    private Date date;    
    double salary;   // default salary is 3000
    public Staff(){
        this(new Date(), 3000.00);
    }
    public Staff(Date date, double salary){
        this.setDate(date);
        this.setSalary(salary);
    }
    public Staff(Person person, Date date, double salary){
        super(person);
        this.setDate(date);
        this.setSalary(salary);
    }
    public Staff(Name name, Address address, Date date, double salary){
        this(new Person(name, address, 0, ""), date, salary);
    }
    public void setDate(Date date){this.date = date;}    
    public Date getDate(){return date;}
    public void setSalary(double salary){this.salary = salary;}    
    public double getSalary(){return salary;}
    @Override
    public String toString(){
        return (super.toString() +
               "Date: " + this.getDate() + 
               "\nSalary: " + this.getSalary() + "\n");
    }
}
