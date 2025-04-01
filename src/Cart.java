import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public void removeProduct(int productId) {
        items.removeIf(p -> p.getId() == productId);
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    public List<Product> getItems() {
        return items;
    }
}
