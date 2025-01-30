
import java.util.Arrays;



public class ProductApp {
    public static void main(String[] var){
        String uInput;
        int index = 0 ;
        Product [] productArray = new Product[10];

        do {
            Product product; 
            product = ProductDB.getProduct(Validator.getString("Please enter the product code: "));
            if (product == null ){
                System.out.println("No product matches this product code.");
            }
            else {
                System.out.println(product.toString());
                productArray[index] = product;
                System.out.println("Product Count: " + productArray[index].getCount() );  
                index++;
            }
           uInput = Validator.getString("Do you want to continue? (y/n) ");
        } while( uInput.equalsIgnoreCase("y") && index < (productArray.length - 1) );

        if ( (index + 1) >= productArray.length ) {
            System.out.println("Max no. of attempts accomplished.");
        }

        System.out.println("Hii");
        if(index != 0){
            System.out.println(index);
            Arrays.sort(productArray, 0, index);
        }
        System.out.println("Bye");

        int count = 0;
        for( Product elements : productArray){
            count ++;
            if ( elements == null ) {
                System.out.println("Null");
                break;
            }
            else{
                System.out.println( "\n" + count + " : ");
                System.out.println( elements.toString() );
            }
        }
    }
}
