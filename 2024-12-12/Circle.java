import java.text.NumberFormat;

public class Circle{
    private double radius = 0;
    private static int count = 0;

    public Circle(){
        radius = Validator1.getDouble("Please Enter the Radius:");
        count++;
    }

    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    public String getFormattedCircumference(){
        return NumberFormat.getInstance().format(getCircumference());
    }
    public double getArea(){
        return java.lang.Math.PI*radius*radius;
    }

    public String getFormattedArea(){
        return NumberFormat.getInstance().format(getArea());
    }

    public static int getObjectCount(){
        return count;
    }

}



