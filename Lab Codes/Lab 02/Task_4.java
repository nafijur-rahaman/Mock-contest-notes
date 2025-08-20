class Product {
    String productName;
    double unitPrice;
    int StockQuantity;

    void setProduct(String n, double p, int q) {
        productName = n;
        unitPrice = p;
        StockQuantity = q;
    }

    void sellProduct(int qtySold) {

        if (qtySold <= StockQuantity) {
            StockQuantity -= qtySold;
            System.out.println("Product Sold Successfully");
        } else {
            System.out.println("Out of Stock");
        }
    }

    double calculateStockValue() {
        return unitPrice * StockQuantity;
    }

    void showProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Stock Quantity: " + StockQuantity);
    }

}

public class Task_4 {
    public static void main(String arg[]) {
        System.out.println("Md. Nafijur Rahaman\n\n");
        Product p1 = new Product();

        p1.setProduct("Laptop", 50000, 10);
        System.out.println("Before Sell Product: \n\n");
        p1.showProduct();
        System.out.println("Stock Value: " + p1.calculateStockValue());
        System.out.println("\n\nAfter Sell Product: \n\n");
        p1.sellProduct(5);
        p1.showProduct();
        System.out.println("Stock Value: " + p1.calculateStockValue());
        System.out.println("\n\nId: 20234103116");
    }
}
