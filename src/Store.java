import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();;

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> filter(Filter strategy, String criteria) {
        return strategy.filter(products, criteria);
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(products);
    }
}
