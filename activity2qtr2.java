
import java.util.Scanner;

public class activity2qtr2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product product = new product();

        System.out.println("Input product name:");
        product.setProductName(sc.nextLine());
        System.out.println("Input price:");
        product.setPrice(sc.nextDouble());
        System.out.println("Input stock:");
        product.setStock(sc.nextInt());

        product.infoDisplay();

        boolean whileControl = true;
        while(whileControl){
            System.out.println("Enter price and stock again?[Yes/No]");
            String choice = sc.next();

            if(choice.equalsIgnoreCase("yes")){
                System.out.println("Enter new price:");
                double newPrice = sc.nextDouble();
                System.out.println("Enter new stock:");
                int newStock = sc.nextInt();
                product.setPrice(newPrice);
                product.setStock(newStock);
                System.out.println();
            }else if (choice.equalsIgnoreCase("no")){
                whileControl = false;
            }else{
                System.out.println("Invalid input types. Please enter YES/NO");
            }
        }
        product.infoDisplay();

        sc.close();
    }
}