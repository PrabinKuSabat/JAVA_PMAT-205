public class CircleTester {
    public static void main(String[] args){
        String uInput;
        do{
            Circle c1 = new Circle();
            System.out.println("Circumference: " + c1.getFormattedCircumference());
            System.out.println("Area: " + c1.getFormattedArea());
            uInput = Validator.getString("Do you want to continue? (y/n) "); 
        }while( uInput == "y");

    }
}
