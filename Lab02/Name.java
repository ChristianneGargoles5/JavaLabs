/**
 * Write a description of class Name here.
 * 
 * @author Milan Samplewala
 * @version Sept 14, 2018
 */
public class Name{
    private String fName;
    private String lName;
    public Name(){this("", "");}
    public Name(Name name){
        this(name.getFName(),name.getLName());
    }
    public Name(String fName, String lName){
        this.setFName(fName);
        this.setLName(lName); 
    }
    public void setFName(String fName){this.fName = fName;}
    public String getFName(){return this.fName;}
    public void setLName(String lName){this.lName = lName;}
    public String getLName(){return this.lName;}
    public String getName(){return this.getFName() + " " + this.getLName();}
    public String getLastFirst(){return this.getLName() + ", " + this.getFName();}
    @Override
    public String toString() {
        return ("First name: " + this.getFName() + 
                "\nLast name: " + this.getLName()) + "\n";
    }
}