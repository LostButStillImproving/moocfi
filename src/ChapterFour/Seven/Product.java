package ChapterFour.Seven;

public class Product {

    double price;
    int quantity;
    String name;

    public Product(String initalName, double initialPrice , int initialQuantity) {
        this.price = initialPrice;
        this.quantity = initialQuantity;
        this.name = initalName;
    }

    public void printProduct() {
        System.out.println(this.name + "," + " price " + this.price + "," + " " + this.quantity + " pcs");
    }

    public static void main(String[] args) {
        Product product = new Product("Banana", 1.1, 13);
        product.printProduct();
    }
}
