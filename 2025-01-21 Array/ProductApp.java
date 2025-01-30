

public class ProductApp {
    public static void main(String[] var){
        String uInput;
        int count;
        Product [] productArray = new Product[10];
        do {
           Product product = new Product();
           count = product.getCount();
           product = ProductDB.getProduct(Validator.getString("Please enter the product code: "));
           if (product == null ){
                System.out.println("No product matches this product code.");
           }
           else {
                System.out.println(product.toString());
                productArray[count] = product;
                product.countUP();
                count++;
                System.out.println("Product Count: " + count );  
           }
           uInput = Validator.getString("Do you want to continue? (y/n) ");
        } while( uInput.equalsIgnoreCase("y") && count < (productArray.length - 1) );

        if ( (count + 1) >= productArray.length ) {
            System.out.println("Max no. of attempts accomplished.");
        }
        else {
            count = 0;
            for( Product elements : productArray){
                if ( elements == null ) {
                    return;
                }
                else{
                    count++;
                    System.out.println( "\n" + count + " : ");
                    System.out.println( elements.toString() );
                }
            }
        }

    }
}
