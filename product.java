public class product{
    private  String productName;
    private double price;
    private int stock;

    public String getProductName(){
        return productName;
    }
    
    public void setProductName(String productName){
        this.productName = productName;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        if(price>=0){
            this.price = price;
        }else{
            System.out.println("Invalid Price!");
        }
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        if(stock >= 0){
            this.stock = stock;
        }else{
            System.out.println("Invalid Stock!");
        }
    }

    public void infoDisplay(){
        System.out.println("Product Information");
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + price);
        System.out.println("Product Stock: " + stock);
    }
}