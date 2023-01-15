
/**
 * Write a description of class Triangle here.
 * 
 * @Christianne Gargoles
 * @version 9/25/18
 */
public class Triangle extends GeometricObject {
private double side1;
private double side2;
private double side3;

public Triangle(){
}
public Triangle(double side1,double side2,double side3){
    this.side1=side1;
    this.side2=side2;
    this.side3=side3;
}
public double getSide1(){
    return side1;
}
public void setSide1(double side1){
    this.side1=side1;
}
public double getSide2(){
    return side2;
}
public void setSide2(double side2){
    this.side2=side2;
}
public double getside3(){
    return side3;
}
public void setSide3 (double side3){
    this.side3=side3;
}
@Override
public double getPerimeter (){
    return side1+side2+side3;
}
@Override 
public double getArea(){
    double s= this.getPerimeter()/2;
    return Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));

}
@Override 
public String toString(){
    super.toString();
    return "\nSide1: "+this.side1 +"\nSide2: "+ this.side2+"\nSide3: "+this.side3+"\nPerimeter: " +this.getPerimeter() + "\nArea "+this.getArea();
    }
}
