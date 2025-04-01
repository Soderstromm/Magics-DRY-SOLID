import java.util.List;
import java.util.stream.Collectors;

public class PriceFilter implements Filter{

    @Override
    public List<Product> filter(List<Product> products, String criteria) {
        double maxPrice = Double.parseDouble(criteria);
        return products.stream()
                .filter(p -> p.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }
}
