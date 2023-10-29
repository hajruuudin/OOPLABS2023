package org.example;

//I was practicing for the quiz so all classes are in one file
// The ENUM class
enum FillType{
    FILLED, NOT_FILLED;
}

//Main shape class
class Shape{
    private String color;
    private FillType fillType;

    public Shape(String color, FillType fill){
        this.color = color;
        this.fillType = fill;
    }

    public String displayInfo() {
        return super.toString();
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color2){
        this.color = color2;
    }

    public FillType getFillType() {
        return fillType;
    }

    public void setFillType(FillType fillType) {
        this.fillType = fillType;
    }
}

//Derived Shape class
class Circle extends Shape{
    private double radius;


    public Circle(String color, FillType fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    @Override
    public String displayInfo(){
        return "Color: " + this.getColor() + "\n"
                + "Radius: " + this.radius + "\n"
                + "Filled Type: " + this.getFillType();
    }

    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    public double calculateCirmcumference(double PI){
        return 2 * PI * this.radius;
    }


    public double calculateCirmcumference(){
        return 2 * 3.14 * this.radius;
    }
}

//Derived Rectangle class
class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, FillType filltype, double width, double height){
        super(color, filltype);
        this.width = width;
        this.height = height;
    }

    public String displayInfo(){
        return "Color: " + this.getColor() + "\n"
                + "Width: " + this.width + "\n"
                + "Height " + this.height + "\n"
                + "Filled Type: " + this.getFillType();
    }

    public double getArea(){
        return this.width * this.height;
    }
}

//Main Class
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Yellow", FillType.NOT_FILLED, 2.45);
        Rectangle rectangle1 = new Rectangle("Green", FillType.FILLED, 4.4,5.7);
        System.out.println(circle1.displayInfo());
        System.out.println(rectangle1.displayInfo());
    }
}

