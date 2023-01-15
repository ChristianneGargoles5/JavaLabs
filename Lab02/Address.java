/**
 * Write a description of class Address here.
 * 
 * @author Milan Samplewala
 * @version Sept 14, 2018
 */
public class Address{
    private String addressLine1;
    private String addressLine2;
    public Address(){this("", "");}
    public Address(Address address){
        this(address.getAddressLine1(), address.getAddressLine2());
    }
    public Address(String addressLine1, String addressLine2){
        this.setAddressLine1(addressLine1);
        this.setAddressLine2(addressLine2);
    }
    public void setAddressLine1(String addressLine1){
        this.addressLine1 = addressLine1;
    }
    public String getAddressLine1(){return this.addressLine1;}
    public void setAddressLine2(String addressLine2){
        this.addressLine2 = addressLine2;
    }
    public String getAddressLine2(){return this.addressLine2;}
    @Override 
    public String toString(){
        return ("Address Line 1: " + this.getAddressLine1() +
                "\nAddress Line 2: " + this.getAddressLine2());
    }
}
