import java.util.List;

public interface Filter {
    List<Product> filter(List<Product> products, String criteria);
}
