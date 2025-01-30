public class ProductApp {
    public static void main(String[] var){
        String uInput;
        do {
           Product product;
           product = ProductDB.getProduct(Validator.getString("Please enter the product code: "));
           if (product == null ){
                System.out.println("No product matches this product code.");
           }
           else {
                System.out.println(product.toString());
                product.countUP();
                System.out.println("Product Count: " + product.getCount());
           }
           uInput = Validator.getString("Do you want to continue? (y/n) ");
        } while( uInput.equalsIgnoreCase("y"));
    }
}
