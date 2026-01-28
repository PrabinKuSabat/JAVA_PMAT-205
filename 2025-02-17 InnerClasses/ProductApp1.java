import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;



public class ProductApp1 {
    public static void main(String[] var){
        String uInput;
        int attempCount = 0 ;
        List<Product> productList = new ArrayList<>();

        do {
            Product product; 
            product = ProductDB.getProduct(Validator.getString("Please enter the product code: "));
            if (product == null ){
                System.out.println("No product matches this product code.");
            }
            else {
                System.out.println(product.toString());
                productList.add(product);
                System.out.println("Product Count: " + Product.getCount());  
            }
            attempCount++;
           uInput = Validator.getString("Do you want to continue? (y/n) ");
        } while( uInput.equalsIgnoreCase("y") && attempCount < 1000 );

        if ( (attempCount) >= 1000 ) {
            System.out.println("Max no. of attempts accomplished.");
        }

        if(!productList.isEmpty()){
            productList.sort(productList.get(0).getPriceComparator());
            System.out.println("\n Sorted by Price (Ascending)");
            displayProducts(productList);

            Comparator<Product> codeComparator = productList.get(0).getCodeComparator();
            productList.sort(codeComparator);
            System.out.println("\nSorted by Code (Ascending): ");
            displayProducts(productList);

            productList.sort(productList.get(0).getPriceComparatorDescending());
            System.out.println("\nSorted by Price (Descending):");
            displayProducts(productList);
        }
    }

    private static void displayProducts(List<Product> products){
        int count = 0;
        for (Product product : products) {
            count ++;
            System.out.println(count + " : " + product);
        }
    }
}
