import java.text.NumberFormat;

public class Circle 
{
    	private double radius;
    	private static int objectCount = 0;

	public Circle(double inputRadius) 
	{
    		radius = inputRadius;
    		objectCount++;
	}

    	public double getCircumference() 
	{
        	return 2 * Math.PI * radius;
    	}

    	public String getFormattedCircumference() 
	{
        	NumberFormat nf = NumberFormat.getInstance();
        	nf.setMaximumFractionDigits(3); 
        	nf.setMinimumFractionDigits(2);
        	return nf.format(getCircumference());
    	}

    	public double getArea() 
	{
        	return Math.PI * radius * radius;
    	}

    	public String getFormattedArea() 
	{
        	NumberFormat nf = NumberFormat.getInstance();
        	nf.setMaximumFractionDigits(3);  
        	nf.setMinimumFractionDigits(2);
        	return nf.format(getArea());
    	}

    	public static int getObjectCount() 
	{
        	return objectCount;
    	}
}
