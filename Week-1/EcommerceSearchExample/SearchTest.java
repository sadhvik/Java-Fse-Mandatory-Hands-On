public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shoes", "Fashion"),
            new Product(150, "Keyboard", "Electronics"),
            new Product(109, "T-shirt", "Fashion"),
            new Product(304, "Smartphone", "Electronics")
        };

        int targetId = 150;

        System.out.println("Linear Search:");
        Product result1 = LinearSearch.search(products, targetId);
        if (result1 != null) result1.display();
        else System.out.println("Product not found.");

        System.out.println("\nBinary Search:");
        Product result2 = BinarySearch.search(products, targetId);
        if (result2 != null) result2.display();
        else System.out.println("Product not found.");

        System.out.println();
        TimeComplexityInfo.printAnalysis();
    }
}
